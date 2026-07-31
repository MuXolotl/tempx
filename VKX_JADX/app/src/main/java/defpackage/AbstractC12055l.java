package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.util.List;

/* JADX INFO: renamed from: lِۗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12055l extends AbstractC6242l implements InterfaceC2957l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f23980l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC0601l f23983l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C6084l f23985l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f23986l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC1220l f23988l = AbstractC9968l.crashlytics(2, new C16285l(this, 0));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC1220l f23981l = AbstractC9968l.crashlytics(2, new C16285l(this, 1));

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC1220l f23982l = AbstractC9968l.crashlytics(2, new C16285l(this, 2));

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC1220l f23987l = AbstractC9968l.crashlytics(2, new C16285l(this, 3));

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final InterfaceC1220l f23984l = AbstractC9968l.crashlytics(2, new C16285l(this, 4));

    public AbstractC12055l(AbstractC0601l abstractC0601l, String str, Object obj, C6084l c6084l) {
        this.f23983l = abstractC0601l;
        this.f23980l = str;
        this.f23986l = obj;
        this.f23985l = c6084l;
    }

    @Override // defpackage.InterfaceC18672l
    public final AbstractC0601l ad() {
        return this.f23983l;
    }

    @Override // defpackage.InterfaceC18672l
    public final List admob() {
        return (List) this.f23988l.getValue();
    }

    public final boolean equals(Object obj) {
        InterfaceC2957l interfaceC2957lLoadAd = AbstractC5592l.loadAd(obj);
        return interfaceC2957lLoadAd != null && AbstractC8576l.yandex(this.f23983l, interfaceC2957lLoadAd.ad()) && AbstractC8576l.yandex(this.f23985l.loadAd, interfaceC2957lLoadAd.getName()) && AbstractC8576l.yandex(this.f23980l, interfaceC2957lLoadAd.loadAd()) && AbstractC8576l.yandex(this.f23986l, interfaceC2957lLoadAd.inmobi());
    }

    /* JADX INFO: renamed from: extends */
    public abstract AbstractC1952l mo1343extends();

    @Override // defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public final boolean firebase() {
        return false;
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return this.f23985l.loadAd;
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return (List) this.f23981l.getValue();
    }

    @Override // defpackage.InterfaceC6902l
    public final List getTypeParameters() {
        return ((C12843l) this.f23987l.getValue()).yandex;
    }

    public final int hashCode() {
        return this.f23980l.hashCode() + AbstractC12589l.advert(this.f23983l.hashCode() * 31, 31, this.f23985l.loadAd);
    }

    @Override // defpackage.InterfaceC18672l
    public final Object inmobi() {
        return this.f23986l;
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return mo1343extends().isPro();
    }

    @Override // defpackage.InterfaceC2957l
    public final String loadAd() {
        return this.f23980l;
    }

    @Override // defpackage.InterfaceC2957l
    public final Field metrica() {
        return (Field) this.f23984l.getValue();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Member m3356private() {
        C13698l c13698l = AbstractC15547l.adcel;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[41];
        C6084l c6084l = this.f23985l;
        if (!c13698l.m3679package(c6084l)) {
            return null;
        }
        C1559l c1559l = AbstractC10565l.admob(c6084l).purchase;
        if (c1559l == null) {
            return metrica();
        }
        return this.f23983l.m655catch(c1559l.loadAd, c1559l.crashlytics);
    }

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return AbstractC9498l.purchase(this.f23983l, this.f23980l);
    }

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return (InterfaceC13012l) this.f23982l.getValue();
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l startapp() {
        mo1343extends().getClass();
        return null;
    }

    @Override // defpackage.AbstractC6242l
    /* JADX INFO: renamed from: synchronized */
    public final EnumC9790l mo1541synchronized() {
        C10038l c10038l = AbstractC15547l.metrica;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[34];
        return (EnumC9790l) c10038l.m2845finally(this.f23985l);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        C8565l.purchase(sb, this);
        sb.append(this instanceof InterfaceC4469l ? "var " : "val ");
        C8565l.subs(sb, this);
        C8565l.billing(this.f23985l.loadAd, sb);
        sb.append(": ");
        sb.append(C8565l.tapsense(smaato(), false));
        return sb.toString();
    }
}
