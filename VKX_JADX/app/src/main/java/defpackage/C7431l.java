package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؚٟٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7431l extends AbstractC2597l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C7431l f15378l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C2630l f15379l = new C2630l(17);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15380l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f15381l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte f15382l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f15383l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C0012l f15384l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C8107l f15385l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f15386l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C5665l f15387l;

    static {
        C7431l c7431l = new C7431l();
        f15378l = c7431l;
        c7431l.f15385l = C8107l.f16892l;
        c7431l.f15384l = C0012l.f862l;
        c7431l.f15387l = C5665l.f12045l;
        c7431l.f15381l = Collections.EMPTY_LIST;
    }

    public C7431l(C1718l c1718l, C3429l c3429l) {
        this.f15382l = (byte) -1;
        this.f15386l = -1;
        this.f15385l = C8107l.f16892l;
        this.f15384l = C0012l.f862l;
        this.f15387l = C5665l.f12045l;
        this.f15381l = Collections.EMPTY_LIST;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        C14643l c14643lSubs = null;
                        C3730l c3730l = null;
                        C3730l c3730l2 = null;
                        if (iMetrica == 10) {
                            if ((this.f15380l & 1) == 1) {
                                C8107l c8107l = this.f15385l;
                                c8107l.getClass();
                                c3730l = new C3730l(3);
                                c3730l.f7796l = C7088l.f14852l;
                                c3730l.remoteconfig(c8107l);
                            }
                            C8107l c8107l2 = (C8107l) c1718l.admob(C8107l.f16893l, c3429l);
                            this.f15385l = c8107l2;
                            if (c3730l != null) {
                                c3730l.remoteconfig(c8107l2);
                                this.f15385l = c3730l.subs();
                            }
                            this.f15380l |= 1;
                        } else if (iMetrica == 18) {
                            if ((this.f15380l & 2) == 2) {
                                C0012l c0012l = this.f15384l;
                                c0012l.getClass();
                                c3730l2 = new C3730l(1);
                                c3730l2.f7796l = Collections.EMPTY_LIST;
                                c3730l2.smaato(c0012l);
                            }
                            C0012l c0012l2 = (C0012l) c1718l.admob(C0012l.f863l, c3429l);
                            this.f15384l = c0012l2;
                            if (c3730l2 != null) {
                                c3730l2.smaato(c0012l2);
                                this.f15384l = c3730l2.admob();
                            }
                            this.f15380l |= 2;
                        } else if (iMetrica == 26) {
                            if ((this.f15380l & 4) == 4) {
                                C5665l c5665l = this.f15387l;
                                c5665l.getClass();
                                c14643lSubs = C14643l.subs();
                                c14643lSubs.isPro(c5665l);
                            }
                            C5665l c5665l2 = (C5665l) c1718l.admob(C5665l.f12044l, c3429l);
                            this.f15387l = c5665l2;
                            if (c14643lSubs != null) {
                                c14643lSubs.isPro(c5665l2);
                                this.f15387l = c14643lSubs.admob();
                            }
                            this.f15380l |= 4;
                        } else if (iMetrica == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.f15381l = new ArrayList();
                                c = '\b';
                            }
                            this.f15381l.add(c1718l.admob(C6582l.f13769l, c3429l));
                        } else if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                        }
                    }
                    z = true;
                } catch (C12383l e) {
                    e.f24472l = this;
                    throw e;
                } catch (IOException e2) {
                    C12383l c12383l = new C12383l(e2.getMessage());
                    c12383l.f24472l = this;
                    throw c12383l;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.f15381l = DesugarCollections.unmodifiableList(this.f15381l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f15383l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.f15381l = DesugarCollections.unmodifiableList(this.f15381l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f15383l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C4551l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f15380l & 1) == 1) {
            c11522l.m3120public(1, this.f15385l);
        }
        if ((this.f15380l & 2) == 2) {
            c11522l.m3120public(2, this.f15384l);
        }
        if ((this.f15380l & 4) == 4) {
            c11522l.m3120public(3, this.f15387l);
        }
        for (int i = 0; i < this.f15381l.size(); i++) {
            c11522l.m3120public(4, (AbstractC14080l) this.f15381l.get(i));
        }
        c10023l.m2827for(200, c11522l);
        c11522l.m3129try(this.f15383l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f15386l;
        if (i != -1) {
            return i;
        }
        int iStartapp = (this.f15380l & 1) == 1 ? C11522l.startapp(1, this.f15385l) : 0;
        if ((this.f15380l & 2) == 2) {
            iStartapp += C11522l.startapp(2, this.f15384l);
        }
        if ((this.f15380l & 4) == 4) {
            iStartapp += C11522l.startapp(3, this.f15387l);
        }
        for (int i2 = 0; i2 < this.f15381l.size(); i2++) {
            iStartapp += C11522l.startapp(4, (AbstractC14080l) this.f15381l.get(i2));
        }
        int size = this.f15383l.size() + isPro() + iStartapp;
        this.f15386l = size;
        return size;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f15378l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C4551l c4551lSubs = C4551l.subs();
        c4551lSubs.isPro(this);
        return c4551lSubs;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f15382l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f15380l & 2) == 2 && !this.f15384l.yandex()) {
            this.f15382l = (byte) 0;
            return false;
        }
        if ((this.f15380l & 4) == 4 && !this.f15387l.yandex()) {
            this.f15382l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f15381l.size(); i++) {
            if (!((C6582l) this.f15381l.get(i)).yandex()) {
                this.f15382l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f15382l = (byte) 1;
            return true;
        }
        this.f15382l = (byte) 0;
        return false;
    }

    public C7431l() {
        this.f15382l = (byte) -1;
        this.f15386l = -1;
        this.f15383l = AbstractC7735l.f16231l;
    }

    public C7431l(C4551l c4551l) {
        super(c4551l);
        this.f15382l = (byte) -1;
        this.f15386l = -1;
        this.f15383l = c4551l.f5168l;
    }
}
