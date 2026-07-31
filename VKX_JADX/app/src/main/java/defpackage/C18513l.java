package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: lّۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18513l extends C12382l {
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static Long m4565import(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.C12382l, defpackage.AbstractC5921l
    public final void billing(C14025l c14025l, C14025l c14025l2) throws IOException {
        try {
            Files.move(Paths.get(c14025l.f27331l.tapsense(), new String[0]), Paths.get(c14025l2.f27331l.tapsense(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            C18262l.metrica("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.C12382l, defpackage.AbstractC5921l
    /* JADX INFO: renamed from: private */
    public final C18402l mo694private(C14025l c14025l) {
        C14025l c14025lAdcel;
        Path path = Paths.get(c14025l.f27331l.tapsense(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C14025l.f27330l;
                c14025lAdcel = C6162l.adcel(symbolicLink.toString(), false);
            } else {
                c14025lAdcel = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM4565import = fileTimeCreationTime != null ? m4565import(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM4565import2 = fileTimeLastModifiedTime != null ? m4565import(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C18402l(zIsRegularFile, zIsDirectory, c14025lAdcel, lValueOf, lM4565import, lM4565import2, fileTimeLastAccessTime != null ? m4565import(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.C12382l
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
