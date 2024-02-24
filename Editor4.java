import java.awt.Color;
/**
 * This client program performs a striking visual effect: it morphs an image into its grayscaled
version by using Runigram's moprh and grayscale functions
 */
public class Editor4 {
	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}
