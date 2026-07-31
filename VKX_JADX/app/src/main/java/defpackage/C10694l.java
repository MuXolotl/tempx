package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: lَۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10694l extends AbstractViewOnTouchListenerC7596l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21706l = 0;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ View f21707l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10694l(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f21707l = actionMenuItemView;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC7596l
    public boolean amazon() {
        switch (this.f21706l) {
            case 1:
                C0791l c0791l = ((C11353l) this.f21707l).f22898l;
                if (c0791l.f2388l != null) {
                    return false;
                }
                c0791l.mopub();
                return true;
            default:
                return super.amazon();
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC7596l
    public final boolean crashlytics() {
        InterfaceC17816l interfaceC17816lLoadAd;
        int i = this.f21706l;
        View view = this.f21707l;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                InterfaceC9863l interfaceC9863l = actionMenuItemView.f73l;
                return interfaceC9863l != null && interfaceC9863l.yandex(actionMenuItemView.f66l) && (interfaceC17816lLoadAd = loadAd()) != null && interfaceC17816lLoadAd.loadAd();
            default:
                ((C11353l) view).f22898l.smaato();
                return true;
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC7596l
    public final InterfaceC17816l loadAd() {
        C14858l c14858l;
        int i = this.f21706l;
        View view = this.f21707l;
        switch (i) {
            case 0:
                AbstractC9183l abstractC9183l = ((ActionMenuItemView) view).f65l;
                if (abstractC9183l == null || (c14858l = ((C15577l) abstractC9183l).yandex.f2389l) == null) {
                    return null;
                }
                return c14858l.yandex();
            default:
                C14858l c14858l2 = ((C11353l) view).f22898l.f2394l;
                if (c14858l2 == null) {
                    return null;
                }
                return c14858l2.yandex();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10694l(C11353l c11353l, C11353l c11353l2) {
        super(c11353l2);
        this.f21707l = c11353l;
    }
}
