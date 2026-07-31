package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* JADX INFO: renamed from: lًٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8023l implements InterfaceC9988l {
    public final int amazon;
    public final C3242l billing;
    public final int crashlytics;
    public final List loadAd;
    public C18730l mopub;
    public final boolean purchase;
    public final C17248l yandex;

    public C8023l(C17248l c17248l, List list, int i, int i2, boolean z, C3242l c3242l) {
        this.yandex = c17248l;
        this.loadAd = list;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = z;
        this.billing = c3242l;
        if (list.size() > 1) {
            return;
        }
        AbstractC14825l.crashlytics("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + ".");
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l admob() {
        return (C3737l) this.loadAd.get(startapp(this.amazon, false));
    }

    @Override // defpackage.InterfaceC9988l
    public final C3242l amazon() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC9988l
    public final int billing() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l crashlytics(long j) {
        C18730l c18730l = this.mopub;
        if (c18730l == null) {
            c18730l = new C18730l();
            List list = this.loadAd;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3737l c3737l = (C3737l) list.get(i);
                long j2 = c3737l.yandex;
                int iCrashlytics = c18730l.crashlytics(j2);
                Object[] objArr = c18730l.crashlytics;
                Object obj = objArr[iCrashlytics];
                c18730l.loadAd[iCrashlytics] = j2;
                objArr[iCrashlytics] = c3737l;
            }
            this.mopub = c18730l;
        }
        return (C3737l) c18730l.purchase(j);
    }

    @Override // defpackage.InterfaceC9988l
    public final int firebase() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l isPro() {
        return (C3737l) this.loadAd.get(startapp(this.crashlytics, true));
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l loadAd() {
        return this.purchase ? isPro() : admob();
    }

    public final int metrica(long j) {
        try {
            return this.yandex.crashlytics(j);
        } catch (NoSuchElementException e) {
            C4875l.remoteconfig(AbstractC2812l.ads(j, "Invalid selectableId: "), e);
            return 0;
        }
    }

    @Override // defpackage.InterfaceC9988l
    public final int mopub() {
        return this.loadAd.size();
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l purchase() {
        return subs() == 1 ? admob() : isPro();
    }

    @Override // defpackage.InterfaceC9988l
    public final boolean remoteconfig(InterfaceC9988l interfaceC9988l) {
        if (this.billing != null && interfaceC9988l != null && (interfaceC9988l instanceof C8023l)) {
            C8023l c8023l = (C8023l) interfaceC9988l;
            List list = c8023l.loadAd;
            if (this.purchase == c8023l.purchase && this.crashlytics == c8023l.crashlytics && this.amazon == c8023l.amazon) {
                List list2 = this.loadAd;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        C3737l c3737l = (C3737l) list2.get(i);
                        C3737l c3737l2 = (C3737l) list.get(i);
                        if (c3737l.yandex != c3737l2.yandex || c3737l.crashlytics != c3737l2.crashlytics || c3737l.amazon != c3737l2.amazon) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC9988l
    public final void smaato(C16931l c16931l) {
        int iMetrica = metrica(purchase().yandex);
        int iMetrica2 = metrica((subs() == 1 ? isPro() : admob()).yandex);
        int i = iMetrica + 1;
        if (i >= iMetrica2) {
            return;
        }
        while (i < iMetrica2) {
            c16931l.invoke(this.loadAd.get(i));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int startapp(int i, boolean z) {
        int iInmobi = AbstractC5020l.inmobi(subs());
        boolean z2 = z;
        if (iInmobi == 0) {
            z2 = !z ? 1 : 0;
        } else if (iInmobi != 1) {
            if (iInmobi != 2) {
                C18725l.billing();
                return 0;
            }
        }
        return (i - (!z2)) / 2;
    }

    @Override // defpackage.InterfaceC9988l
    public final int subs() {
        int i = this.crashlytics;
        int i2 = this.amazon;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return ((C3737l) this.loadAd.get(i / 2)).loadAd();
    }

    public final String toString() {
        boolean z = true;
        float f = (this.crashlytics + 1) / 2.0f;
        float f2 = (this.amazon + 1) / 2.0f;
        int iSubs = subs();
        StringBuilder sb = new StringBuilder("[\n\t");
        List list = this.loadAd;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C3737l c3737l = (C3737l) list.get(i);
            if (z) {
                z = false;
            } else {
                sb.append(",\n\t");
            }
            i++;
            sb.append(i + " -> " + c3737l);
        }
        sb.append("\n]");
        Unit unit = Unit.INSTANCE;
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.purchase);
        sb2.append(", startPosition=");
        sb2.append(f);
        sb2.append(", endPosition=");
        sb2.append(f2);
        sb2.append(", crossed=");
        sb2.append(AbstractC11043l.pro(iSubs));
        sb2.append(", infos=");
        return AbstractC0653l.ads(sb2, string, ")");
    }

    @Override // defpackage.InterfaceC9988l
    public final C18730l vip(C3242l c3242l) {
        return AbstractC15450l.yandex(c3242l, this.loadAd, new C18334l(28), new C4951l(13, c3242l), new C2125l(c3242l, 0));
    }

    @Override // defpackage.InterfaceC9988l
    public final boolean yandex() {
        return this.purchase;
    }
}
