package defpackage;

import java.util.Collection;

/* JADX INFO: renamed from: lؒۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1394l extends AbstractC13675l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C1394l f3552l = new C1394l();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f3553l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient C1394l f3554l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient Object[] f3555l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object f3556l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f3557l;

    public C1394l(int i, Object[] objArr) {
        this.f3555l = objArr;
        this.f3553l = i;
        this.f3557l = 0;
        int iVip = i >= 2 ? AbstractC8481l.vip(i) : 0;
        Object objSubs = C15333l.subs(objArr, i, iVip, 0);
        if (objSubs instanceof Object[]) {
            throw ((C2164l) ((Object[]) objSubs)[2]).yandex();
        }
        this.f3556l = objSubs;
        Object objSubs2 = C15333l.subs(objArr, i, iVip, 1);
        if (objSubs2 instanceof Object[]) {
            throw ((C2164l) ((Object[]) objSubs2)[2]).yandex();
        }
        this.f3554l = new C1394l(objSubs2, objArr, i, this);
    }

    @Override // defpackage.AbstractC13675l
    public final C5179l amazon() {
        return new C5179l(this, new C3965l(this.f3557l, this.f3553l, this.f3555l));
    }

    @Override // defpackage.AbstractC13675l
    public final C0547l crashlytics() {
        return new C0547l(this, this.f3555l, this.f3557l, this.f3553l);
    }

    @Override // defpackage.AbstractC13675l, java.util.Map
    public final Object get(Object obj) {
        Object objIsPro = C15333l.isPro(this.f3556l, this.f3555l, this.f3553l, this.f3557l, obj);
        if (objIsPro == null) {
            return null;
        }
        return objIsPro;
    }

    @Override // defpackage.AbstractC13675l
    /* JADX INFO: renamed from: mopub */
    public final AbstractC5511l values() {
        return this.f3554l.keySet();
    }

    @Override // defpackage.AbstractC13675l
    public final AbstractC5511l purchase() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3553l;
    }

    @Override // defpackage.AbstractC13675l, java.util.Map
    public final Collection values() {
        return this.f3554l.keySet();
    }

    public C1394l() {
        this.f3556l = null;
        this.f3555l = new Object[0];
        this.f3557l = 0;
        this.f3553l = 0;
        this.f3554l = this;
    }

    public C1394l(Object obj, Object[] objArr, int i, C1394l c1394l) {
        this.f3556l = obj;
        this.f3555l = objArr;
        this.f3557l = 1;
        this.f3553l = i;
        this.f3554l = c1394l;
    }
}
