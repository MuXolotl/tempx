package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؙْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13674l implements InterfaceC6902l, Serializable, InterfaceC6679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Class f26697l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f26698l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient InterfaceC6902l f26699l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f26700l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f26701l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f26702l;

    public AbstractC13674l(Object obj, Class cls, String str, String str2, boolean z) {
        this.f26698l = obj;
        this.f26697l = cls;
        this.f26701l = str;
        this.f26700l = str2;
        this.f26702l = z;
    }

    @Override // defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public boolean firebase() {
        return mo965synchronized().firebase();
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return this.f26701l;
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return mo965synchronized().getParameters();
    }

    @Override // defpackage.InterfaceC6902l
    public final List getTypeParameters() {
        return mo965synchronized().getTypeParameters();
    }

    @Override // defpackage.InterfaceC6902l
    public final Object isVip(Map map) {
        return mo965synchronized().isVip(map);
    }

    public final InterfaceC9191l premium() {
        Class cls = this.f26697l;
        if (cls == null) {
            return null;
        }
        return this.f26702l ? AbstractC18202l.yandex.crashlytics(cls) : AbstractC18202l.yandex.loadAd(cls);
    }

    public abstract InterfaceC6902l pro();

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return AbstractC9498l.purchase(premium(), this.f26700l);
    }

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return mo965synchronized().smaato();
    }

    public InterfaceC6902l subs() {
        InterfaceC6902l interfaceC6902l = this.f26699l;
        if (interfaceC6902l != null) {
            return interfaceC6902l;
        }
        InterfaceC6902l interfaceC6902lPro = pro();
        this.f26699l = interfaceC6902lPro;
        return interfaceC6902lPro;
    }

    /* JADX INFO: renamed from: synchronized */
    public InterfaceC6902l mo965synchronized() {
        InterfaceC6902l interfaceC6902lSubs = subs();
        if (interfaceC6902lSubs != this) {
            return interfaceC6902lSubs;
        }
        throw new C3150l();
    }

    @Override // defpackage.InterfaceC6902l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo823volatile() {
        return mo965synchronized().mo823volatile();
    }
}
