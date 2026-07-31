package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٟٜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C17312l implements applovin, InterfaceC12254l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cstatic f33578l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33579l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f33580l;

    public C17312l(int i, int i2, Cstatic cstatic) {
        this.f33580l = i;
        this.f33579l = i2;
        this.f33578l = cstatic;
    }

    @Override // defpackage.applovin
    public final Ccase billing() {
        try {
            return smaato();
        } catch (IOException e) {
            throw new Celse(e.getMessage());
        }
    }

    public Ccase smaato() {
        return this.f33578l.crashlytics(this.f33580l, this.f33579l);
    }
}
