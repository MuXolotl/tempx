package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٍؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7288l implements InterfaceC13280l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC3348l f15140l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f15139l = new ArrayList();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f15138l = false;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f15137l = false;

    @Override // defpackage.InterfaceC15476l
    public final int amazon() {
        return this.f15140l.amazon();
    }

    public final long billing() {
        if (this.f15137l) {
            return this.f15140l.f7147l.longValue() - 8;
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        return this.f15140l.crashlytics(EnumC17969l.COVER_ART);
    }

    public final boolean equals(Object obj) {
        return this.f15140l.equals(obj);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) throws C9706l {
        remoteconfig(this.f15140l.yandex(enumC17969l, strArr));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean isEmpty() {
        AbstractC3348l abstractC3348l = this.f15140l;
        return abstractC3348l == null || abstractC3348l.isEmpty();
    }

    @Override // defpackage.InterfaceC15476l
    public final Iterator isPro() {
        return this.f15140l.isPro();
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean loadAd() {
        return this.f15140l.f9509l;
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l metrica(AbstractC5859l abstractC5859l) throws C9706l {
        AbstractC3348l abstractC3348l = this.f15140l;
        AbstractC6745l.loadAd(abstractC5859l, "artwork");
        abstractC3348l.metrica(abstractC5859l);
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        return this.f15140l.mopub(enumC17969l);
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        return this.f15140l.purchase(enumC17969l);
    }

    @Override // defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) throws C9706l {
        this.f15140l.remoteconfig(interfaceC4656l);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        return this.f15140l.smaato(abstractC5859l);
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l subs(EnumC17969l enumC17969l) {
        return this.f15140l.purchase(enumC17969l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f15139l.iterator();
        while (it.hasNext()) {
            sb.append(((C2047l) it.next()).toString());
            sb.append("\n");
        }
        if (this.f15140l == null) {
            return "tag:empty";
        }
        sb.append("Aiff ID3 Tag:\n");
        if (this.f15137l) {
            if (this.f15138l) {
                sb.append("\tincorrectly starts as odd byte\n");
            }
            sb.append("\tstartLocation:");
            sb.append(AbstractC6419l.purchase(billing()));
            sb.append("\n\tendLocation:");
            sb.append(AbstractC6419l.purchase(!this.f15137l ? 0L : this.f15140l.f7144l.longValue()));
            sb.append("\n");
        }
        sb.append(this.f15140l.toString());
        sb.append("\n");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return this.f15140l.vip();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        return this.f15140l.yandex(enumC17969l, strArr);
    }
}
