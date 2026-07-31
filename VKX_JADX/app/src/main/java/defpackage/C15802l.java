package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: lٌٕٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15802l implements InterfaceC0684l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11442l f31025l;

    public C15802l(C11442l c11442l) {
        this.f31025l = c11442l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f31025l.close();
    }

    @Override // defpackage.InterfaceC0684l
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final AbstractC15114l mo668l(String str) {
        String upperCase;
        int iHashCode;
        String string = AbstractC12024l.m3330l(str).toString();
        int length = string.length();
        C11442l c11442l = this.f31025l;
        if (length < 3 || ((iHashCode = (upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT)).hashCode()) == 79487 ? !upperCase.equals("PRA") : iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
            return new C13489l(c11442l, str);
        }
        C5441l c5441l = new C5441l(c11442l, str);
        c5441l.f11667l = new int[0];
        c5441l.f11666l = new long[0];
        c5441l.f11669l = new double[0];
        c5441l.f11664l = new String[0];
        c5441l.f11665l = new byte[0][];
        return c5441l;
    }
}
