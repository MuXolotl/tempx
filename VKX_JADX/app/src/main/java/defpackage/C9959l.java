package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۦۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9959l implements InterfaceC1388l, InterfaceC0965l, InterfaceC2224l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f20317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f20318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC1388l f20319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final List f20320l;

    public C9959l(InterfaceC1388l interfaceC1388l, String str, Function1 function1, Function1 function2) {
        this.f20319l = interfaceC1388l;
        this.f20318l = str;
        this.f20317l = (List) function1.invoke(this);
        this.f20320l = (List) function2.invoke(this);
    }

    @Override // defpackage.InterfaceC1388l
    public final Collection adcel() {
        return this.f20319l.adcel();
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean ads() {
        return this.f20319l.ads();
    }

    @Override // defpackage.InterfaceC1388l
    public final Object advert() {
        return this.f20319l.advert();
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean applovin() {
        return this.f20319l.applovin();
    }

    @Override // defpackage.InterfaceC1388l
    public final String billing() {
        return this.f20318l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9959l) {
            return AbstractC8576l.yandex(this.f20319l, ((C9959l) obj).f20319l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC1388l
    public final List getTypeParameters() {
        return this.f20317l;
    }

    @Override // defpackage.InterfaceC1388l
    public final int hashCode() {
        return this.f20319l.hashCode();
    }

    @Override // defpackage.InterfaceC1388l
    public final String license() {
        return AbstractC12024l.m3337protected(this.f20318l);
    }

    @Override // defpackage.InterfaceC1388l
    public final Collection mopub() {
        return this.f20319l.mopub();
    }

    @Override // defpackage.InterfaceC1388l
    /* JADX INFO: renamed from: native */
    public final Collection mo885native() {
        return this.f20319l.mo885native();
    }

    @Override // defpackage.InterfaceC1388l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo886strictfp(Object obj) {
        return this.f20319l.mo886strictfp(obj);
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean subscription() {
        return this.f20319l.subscription();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f20319l + ')';
    }

    @Override // defpackage.InterfaceC1388l
    public final List yandex() {
        return this.f20320l;
    }
}
