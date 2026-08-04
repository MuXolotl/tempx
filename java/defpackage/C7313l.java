package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7313l implements InterfaceC13280l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13975l f15159l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f15161l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C5368l f15164l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC3348l f15166l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f15163l = new ArrayList();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f15162l = false;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f15160l = false;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f15165l = false;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f15159l = new C13975l(4);
    }

    public C7313l(int i) {
        this.f15161l = i;
    }

    public final void adcel() {
        boolean z = billing() instanceof C5368l;
        C13975l c13975l = f15159l;
        if (z) {
            try {
                AbstractC10199l it = AbstractC3799l.f7908l.iterator();
                while (it.hasNext()) {
                    EnumC17969l enumC17969l = (EnumC17969l) it.next();
                    String strSubstring = (String) this.f15164l.purchase(enumC17969l).purchase("");
                    if (!strSubstring.isEmpty()) {
                        AbstractC3348l abstractC3348l = this.f15166l;
                        if (strSubstring.endsWith("\u0000")) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        abstractC3348l.firebase(enumC17969l, strSubstring);
                    } else if (mopub(enumC17969l)) {
                        this.f15166l.advert(enumC17969l);
                    }
                }
                return;
            } catch (C9706l unused) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i = C17500l.yandex;
                return;
            }
        }
        try {
            AbstractC10199l it2 = AbstractC3799l.f7908l.iterator();
            while (it2.hasNext()) {
                EnumC17969l enumC17969l2 = (EnumC17969l) it2.next();
                if (!this.f15166l.m1336throws(enumC17969l2).isEmpty()) {
                    C5368l c5368l = this.f15164l;
                    String strM1336throws = this.f15166l.m1336throws(enumC17969l2);
                    if (!strM1336throws.endsWith("\u0000")) {
                        strM1336throws = strM1336throws.concat("\u0000");
                    }
                    c5368l.firebase(enumC17969l2, strM1336throws);
                } else if (mopub(enumC17969l2)) {
                    C5368l c5368l2 = this.f15164l;
                    c5368l2.getClass();
                    AbstractC6745l.loadAd(enumC17969l2, "genericKey");
                    if (!C5368l.f11505l.contains(enumC17969l2)) {
                        throw new C6451l(enumC17969l2.name(), 18, (byte) 0);
                    }
                    c5368l2.admob(enumC17969l2.name());
                } else {
                    continue;
                }
            }
        } catch (C9706l unused2) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
        }
    }

    public final long admob() {
        if (this.f15160l) {
            return this.f15166l.f7144l.longValue();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC15476l
    public final int amazon() {
        return billing().amazon();
    }

    public final InterfaceC13280l billing() {
        switch (AbstractC5020l.inmobi(this.f15161l)) {
            case 0:
            case 4:
                return this.f15166l;
            case 1:
            case 5:
                return this.f15164l;
            case 2:
            case 6:
                return (this.f15160l || !this.f15165l) ? this.f15166l : this.f15164l;
            case 3:
            case 7:
                return (this.f15165l || !this.f15160l) ? this.f15164l : this.f15166l;
            default:
                return this.f15166l;
        }
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        return billing().crashlytics(EnumC17969l.COVER_ART);
    }

    public final boolean equals(Object obj) {
        return billing().equals(obj);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) {
        remoteconfig(yandex(enumC17969l, strArr));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean isEmpty() {
        return billing() == null || billing().isEmpty();
    }

    @Override // defpackage.InterfaceC15476l
    public final Iterator isPro() {
        return billing().isPro();
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean loadAd() {
        return billing().loadAd();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l metrica(AbstractC5859l abstractC5859l) {
        AbstractC6745l.loadAd(abstractC5859l, "artwork");
        remoteconfig(smaato(abstractC5859l));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        return billing().mopub(enumC17969l);
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        return billing().purchase(enumC17969l);
    }

    @Override // defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) {
        billing().remoteconfig(interfaceC4656l);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        return billing().smaato(abstractC5859l);
    }

    public final long startapp() {
        if (this.f15160l) {
            return this.f15166l.f7147l.longValue() - 8;
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l subs(EnumC17969l enumC17969l) {
        return purchase(enumC17969l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f15163l.iterator();
        while (it.hasNext()) {
            sb.append(((C2047l) it.next()).toString());
            sb.append("\n");
        }
        if (this.f15166l != null) {
            sb.append("Wav ID3 Tag:\n");
            if (this.f15160l) {
                sb.append("\tstartLocation:");
                sb.append(AbstractC6419l.purchase(startapp()));
                sb.append("\n\tendLocation:");
                sb.append(AbstractC6419l.purchase(admob()));
                sb.append("\n");
            }
            sb.append(this.f15166l.toString());
            sb.append("\n");
        }
        C5368l c5368l = this.f15164l;
        if (c5368l != null) {
            sb.append(c5368l.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return billing().vip();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        return billing().yandex(enumC17969l, strArr);
    }
}
