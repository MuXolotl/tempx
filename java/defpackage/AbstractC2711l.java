package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: lؔٙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2711l extends AbstractC1112l implements InterfaceC2957l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC0601l f5867l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f5868l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Object f5869l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C2343l f5870l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f5871l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC1220l f5872l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f5866l = {new C0544l(AbstractC2711l.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C13863l f5864l = new C13863l(29);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final Object f5865l = new Object();

    public AbstractC2711l(AbstractC0601l abstractC0601l, String str, String str2, InterfaceC10696l interfaceC10696l, Object obj, C4233l c4233l) {
        super(c4233l);
        this.f5867l = abstractC0601l;
        this.f5868l = str;
        this.f5871l = str2;
        this.f5869l = obj;
        this.f5872l = AbstractC9968l.crashlytics(2, new C12938l(this, 0));
        this.f5870l = AbstractC3124l.loadAd(interfaceC10696l, new C12938l(this, 1));
    }

    @Override // defpackage.InterfaceC18672l
    public final AbstractC0601l ad() {
        return this.f5867l;
    }

    /* JADX INFO: renamed from: case */
    public abstract AbstractC3258l mo1104case();

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final Member m1239catch() {
        if (!mo818extends().mo2965continue()) {
            return null;
        }
        C3624l c3624l = AbstractC1653l.yandex;
        AbstractC2648l abstractC2648lLoadAd = AbstractC1653l.loadAd(mo818extends());
        if (abstractC2648lLoadAd instanceof C8632l) {
            C8632l c8632l = (C8632l) abstractC2648lLoadAd;
            InterfaceC3588l interfaceC3588l = c8632l.purchase;
            C10459l c10459l = c8632l.amazon;
            if ((c10459l.f21279l & 16) == 16) {
                C6431l c6431l = c10459l.f21277l;
                int i = c6431l.f13453l;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.f5867l.m655catch(interfaceC3588l.getString(c6431l.f13452l), interfaceC3588l.getString(c6431l.f13456l));
            }
        }
        return metrica();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: else, reason: not valid java name and merged with bridge method [inline-methods] */
    public final InterfaceC10696l mo818extends() {
        InterfaceC13922l interfaceC13922l = f5866l[0];
        return (InterfaceC10696l) this.f5870l.invoke();
    }

    public final boolean equals(Object obj) {
        InterfaceC2957l interfaceC2957lLoadAd = AbstractC5592l.loadAd(obj);
        return interfaceC2957lLoadAd != null && AbstractC8576l.yandex(this.f5867l, interfaceC2957lLoadAd.ad()) && AbstractC8576l.yandex(this.f5868l, interfaceC2957lLoadAd.getName()) && AbstractC8576l.yandex(this.f5871l, interfaceC2957lLoadAd.loadAd()) && AbstractC8576l.yandex(this.f5869l, interfaceC2957lLoadAd.inmobi());
    }

    @Override // defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public final boolean firebase() {
        return false;
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return this.f5868l;
    }

    public final int hashCode() {
        return this.f5871l.hashCode() + AbstractC12589l.advert(this.f5867l.hashCode() * 31, 31, this.f5868l);
    }

    @Override // defpackage.InterfaceC18672l
    public final Object inmobi() {
        return this.f5869l;
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return mo1104case().isPro();
    }

    @Override // defpackage.InterfaceC2957l
    public final String loadAd() {
        return this.f5871l;
    }

    @Override // defpackage.InterfaceC2957l
    public final Field metrica() {
        return (Field) this.f5872l.getValue();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: private */
    public final C5380l mo820private() {
        return new C5380l(mo818extends().smaato(), AbstractC0601l.f2039l.amazon(loadAd()) ? null : new C12938l(this, 2), false);
    }

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return AbstractC9498l.purchase(this.f5867l, this.f5871l);
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l startapp() {
        mo1104case().getClass();
        return null;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        C8565l.purchase(sb, this);
        sb.append(this instanceof InterfaceC4469l ? "var " : "val ");
        C8565l.subs(sb, this);
        C8565l.billing(this.f5868l, sb);
        sb.append(": ");
        sb.append(C8565l.tapsense(smaato(), false));
        return sb.toString();
    }

    public AbstractC2711l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        this(abstractC0601l, interfaceC10696l.getName().loadAd(), AbstractC1653l.loadAd(interfaceC10696l).loadAd(), interfaceC10696l, C11128l.f22339l, c4233l);
    }

    public AbstractC2711l(AbstractC0601l abstractC0601l, String str, String str2, Object obj) {
        this(abstractC0601l, str, str2, null, obj, C4233l.subs);
    }
}
