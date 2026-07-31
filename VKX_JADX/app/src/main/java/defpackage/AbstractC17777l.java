package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lً٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17777l implements InterfaceC3177l, InterfaceC0798l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static int f34610l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public View f34611l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int[] f34612l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C9967l f34613l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5268l f34614l = new C5268l(this, true);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C15018l f34615l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f34616l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Context f34617l;

    public AbstractC17777l(Object... objArr) {
        int i = f34610l;
        f34610l = i + 1;
        this.f34616l = i;
        this.f34612l = new int[4];
        if (objArr.length == 0) {
            return;
        }
        C18073l.license("Wrong number of arguments, should be 0! (Override this constuctor(Object...) to prevent mistakes)");
        throw null;
    }

    public final InterfaceC9215l advert() {
        C9967l c9967l = this.f34613l;
        InterfaceC9215l instanceDefaultTransitionTransformer = c9967l != null ? c9967l.getInstanceDefaultTransitionTransformer() : null;
        return instanceDefaultTransitionTransformer != null ? instanceDefaultTransitionTransformer : C9967l.getDefaultTransformer();
    }

    public abstract View applovin(ViewGroup viewGroup);

    public abstract void appmetrica();

    @Override // defpackage.InterfaceC0798l
    public final C15018l firebase() {
        if (this.f34613l == null) {
            C8339l.smaato("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.f34615l == null) {
            this.f34615l = new C15018l();
        }
        return this.f34615l;
    }

    public void inmobi() {
        this.f34614l.purchase(EnumC14812l.ON_PAUSE);
    }

    public final Activity isVip() {
        Context context = this.f34617l;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f34614l;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m4408native(C9967l c9967l) {
        this.f34613l = c9967l;
        Activity activityMopub = C9967l.mopub(c9967l.getContext());
        if (activityMopub != null) {
            this.f34617l = activityMopub;
        } else {
            this.f34617l = c9967l.getContext();
        }
    }

    public boolean signatures() {
        return this instanceof C4975l;
    }

    /* JADX INFO: renamed from: strictfp */
    public abstract void mo1148strictfp();

    /* JADX INFO: renamed from: synchronized */
    public void mo2208synchronized() {
        this.f34614l.purchase(EnumC14812l.ON_RESUME);
    }

    /* JADX INFO: renamed from: throws */
    public void mo2005throws() {
        EnumC14812l enumC14812l = EnumC14812l.ON_CREATE;
        C5268l c5268l = this.f34614l;
        c5268l.purchase(enumC14812l);
        c5268l.purchase(EnumC14812l.ON_START);
    }

    /* JADX INFO: renamed from: volatile */
    public abstract void mo783volatile(View view);

    public void premium() {
    }

    /* JADX INFO: renamed from: package */
    public void mo2004package(int i, String[] strArr, int[] iArr) {
    }
}
