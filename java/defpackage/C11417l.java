package defpackage;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

/* JADX INFO: renamed from: lُۢٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11417l extends SimpleFileVisitor {
    public final /* synthetic */ HashSet yandex;

    public C11417l(HashSet hashSet) {
        this.yandex = hashSet;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        this.yandex.add(C17132l.isPro(obj));
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path parent = C17132l.isPro(obj).getParent();
        if (parent != null) {
            this.yandex.add(parent);
        }
        return FileVisitResult.CONTINUE;
    }
}
