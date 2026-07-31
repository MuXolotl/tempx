package defpackage;

import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًُۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8447l implements InterfaceC12776l, InterfaceC13342l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f17450l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6931l f17451l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l f17452l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function2 f17453l = AbstractC12602l.yandex;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC6475l f17454l;

    public C8447l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C6931l c6931l) {
        this.f17452l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f17451l = c6931l;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        if (enumC14812l == EnumC14812l.ON_DESTROY) {
            yandex();
        } else {
            if (enumC14812l != EnumC14812l.ON_CREATE || this.f17450l) {
                return;
            }
            loadAd(this.f17453l);
        }
    }

    public final void loadAd(Function2 function2) {
        this.f17452l.setOnReadyForComposition(new C2977l(this, function2, 15));
    }

    @Override // defpackage.InterfaceC12776l
    public final void yandex() {
        if (!this.f17450l) {
            this.f17450l = true;
            this.f17452l.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC6475l abstractC6475l = this.f17454l;
            if (abstractC6475l != null) {
                abstractC6475l.loadAd(this);
            }
            this.f17454l = null;
        }
        this.f17451l.yandex();
    }
}
