package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lؔۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3027l implements isVip {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C0971l f6539l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstatic f6540l;

    public C3027l(Cstatic cstatic) {
        this.f6540l = cstatic;
    }

    public static C3241l yandex(Cstatic cstatic) {
        C0971l c0971l = new C0971l(cstatic);
        return new C3241l(AbstractC7016l.crashlytics(c0971l), c0971l.f2674l);
    }

    @Override // defpackage.isVip
    public final InputStream admob() {
        C0971l c0971l = new C0971l(this.f6540l);
        this.f6539l = c0971l;
        return c0971l;
    }

    @Override // defpackage.applovin
    public final Ccase billing() {
        try {
            return yandex(this.f6540l);
        } catch (IOException e) {
            throw new Celse(AbstractC5020l.adcel(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
        }
    }

    @Override // defpackage.isVip
    public final int firebase() {
        return this.f6539l.f2674l;
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() {
        return yandex(this.f6540l);
    }
}
