package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: lْٙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13466l extends AbstractC14165l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10086l f26404l = AbstractC8020l.smaato(0);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10086l f26405l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8688l f26406l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Drawable f26407l;

    public C13466l(Drawable drawable) {
        this.f26407l = drawable;
        InterfaceC1220l interfaceC1220l = AbstractC7041l.yandex;
        this.f26405l = AbstractC8020l.smaato(new C14174l((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC8532l.yandex(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f26406l = new C8688l(new C13802l(28, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f26407l.setAlpha(AbstractC8576l.purchase(AbstractC5573l.ads(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final void billing(EnumC9931l enumC9931l) {
        int i;
        int iOrdinal = enumC9931l.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                C18725l.billing();
                return;
            }
        } else {
            i = 0;
        }
        this.f26407l.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        Drawable.Callback callback = (Drawable.Callback) this.f26406l.getValue();
        Drawable drawable = this.f26407l;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
        ((Number) this.f26404l.getValue()).intValue();
        try {
            interfaceC14859lM4555synchronized.mopub();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f26407l;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, AbstractC5573l.ads(C14174l.billing(interfaceC13349l.admob())), AbstractC5573l.ads(C14174l.crashlytics(interfaceC13349l.admob())));
            } else {
                interfaceC14859lM4555synchronized.yandex(C14174l.billing(interfaceC13349l.admob()) / C14174l.billing(subs()), C14174l.crashlytics(interfaceC13349l.admob()) / C14174l.crashlytics(subs()));
            }
            Canvas canvas = AbstractC10071l.yandex;
            drawable.draw(((C2151l) interfaceC14859lM4555synchronized).yandex);
        } finally {
            interfaceC14859lM4555synchronized.ads();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        Drawable drawable = this.f26407l;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f26407l.setColorFilter(abstractC8939l != null ? abstractC8939l.yandex : null);
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return ((C14174l) this.f26405l.getValue()).yandex;
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        loadAd();
    }
}
