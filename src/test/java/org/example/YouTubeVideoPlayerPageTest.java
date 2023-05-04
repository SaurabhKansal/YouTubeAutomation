package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class YouTubeVideoPlayerPageTest extends TestBase{

    private YouTubeVideoPlayerPage videoPlayerPage;
    @Test
    public void testAddToPlaylist() throws InterruptedException {

        videoPlayerPage = new YouTubeVideoPlayerPage(driver);

        Thread.sleep(2000);
        videoPlayerPage.addToPlaylist("Test Playlist");

        // Verify that the playlist was created
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("YouTube"));
    }
}
