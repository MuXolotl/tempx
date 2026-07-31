package defpackage;

import java.nio.charset.MalformedInputException;

/* JADX INFO: renamed from: lًۢؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8331l extends MalformedInputException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f17235l;

    public C8331l(String str) {
        super(0);
        this.f17235l = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f17235l;
    }
}
