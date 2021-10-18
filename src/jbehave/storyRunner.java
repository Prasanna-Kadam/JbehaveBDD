package jbehave;

import java.util.Collections;

import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.testng.annotations.Test;

public class storyRunner extends ConfigurableEmbedder {
	public Embedder embedder;
	

	@Override
	@Test
	public void run() {
		embedder = configuredEmbedder();
		embedder.configuration();
		System.out.println("Run method");
		String storyPath = "Login_TC1.story";
		embedder.runStoriesAsPaths(Collections.singletonList(storyPath));
	}
	
	public org.jbehave.core.configuration.Configuration configuration() {
		return new MostUsefulConfiguration();
		
	}
	
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(),new LoginSteps());
	}

}