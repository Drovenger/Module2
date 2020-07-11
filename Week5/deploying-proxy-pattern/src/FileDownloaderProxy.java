public class FileDownloaderProxy implements Downloader {
    @Override
    public void download(String userAgent, String url, String dest) {
        FileDownloader fileDownloader = new FileDownloader();
        fileDownloader.download(userAgent, url, dest);
    }
}
