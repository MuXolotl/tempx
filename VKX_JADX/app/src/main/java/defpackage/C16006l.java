package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٕۢٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16006l extends ClassLoader implements Closeable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13963l f31388l;

    public C16006l(ArrayList arrayList, ClassLoader classLoader) {
        super(classLoader);
        this.f31388l = new C13963l((URL[]) arrayList.toArray(new URL[0]), getParent());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f31388l.close();
    }

    @Override // java.lang.ClassLoader
    public final synchronized Class loadClass(String str, boolean z) {
        Class clsLoadClass;
        try {
            clsLoadClass = this.f31388l.findClass(str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = super.loadClass(str, z);
        }
        return clsLoadClass;
    }
}
