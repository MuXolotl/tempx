package defpackage;

import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: renamed from: lٓؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13963l extends URLClassLoader {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ClassLoader f27254l;

    public C13963l(URL[] urlArr, ClassLoader classLoader) {
        super(urlArr, null);
        this.f27254l = classLoader;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        Class clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        try {
            return super.findClass(str);
        } catch (ClassNotFoundException unused) {
            return this.f27254l.loadClass(str);
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final URL findResource(String str) {
        return null;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final Enumeration findResources(String str) {
        return Collections.emptyEnumeration();
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.f27254l.getResource(str);
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.f27254l.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        return this.f27254l.getResources(str);
    }
}
