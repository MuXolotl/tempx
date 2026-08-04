package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15593l {
    public static void loadAd(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && AbstractC8576l.yandex(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            C10754l.pro(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                return;
            }
            C10754l.pro(parentFile, "Failed to create directory: ");
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }

    public static C0360l yandex(InterfaceC18477l interfaceC18477l, C7972l c7972l, C18662l c18662l, Function0 function0) {
        C2580l c2580l = C2580l.f5619l;
        int i = 16;
        InterfaceC14029l interfaceC14029l = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new C0360l(new C15395l(interfaceC18477l, new C8250l(6, c18662l), function0), Collections.singletonList(new C6637l(AbstractC16901l.m4232new(c2580l, c2580l), interfaceC14029l, i)), c7972l, AbstractC3234l.purchase(c18662l));
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new C0360l(new C15395l(interfaceC18477l, function0), Collections.singletonList(new C6637l(AbstractC16901l.m4232new(c2580l, c2580l), interfaceC14029l, i)), c7972l, AbstractC3234l.purchase(c18662l));
        }
    }
}
