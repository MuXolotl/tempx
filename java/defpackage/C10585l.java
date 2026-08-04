package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10585l implements InterfaceC2301l {
    public C16173l billing;
    public final C10023l loadAd;
    public InterfaceC3114l mopub;
    public C17812l purchase;
    public final C8355l remoteconfig;
    public Rect smaato;
    public final View yandex;
    public Function1 crashlytics = new C2613l(29);
    public Function1 amazon = new C18334l(0);
    public C0639l admob = new C0639l(C12814l.loadAd, 4, "");
    public C14966l subs = C14966l.mopub;
    public final ArrayList isPro = new ArrayList();
    public final InterfaceC1220l firebase = AbstractC9968l.crashlytics(3, new C7730l(19, this));

    public C10585l(View view, C1123l c1123l, C10023l c10023l) {
        this.yandex = view;
        this.loadAd = c10023l;
        this.remoteconfig = new C8355l(c1123l, c10023l);
    }

    @Override // defpackage.InterfaceC2301l
    public final InputConnection yandex(EditorInfo editorInfo) {
        C0639l c0639l = this.admob;
        AbstractC7720l.admob(editorInfo, c0639l.yandex.f7563l, c0639l.loadAd, this.subs);
        C10907l c10907l = AbstractC2018l.yandex;
        if (C12304l.amazon()) {
            C12304l.yandex().subs(editorInfo);
        }
        InputConnectionC8406l inputConnectionC8406l = new InputConnectionC8406l(this.admob, new C3585l(17, this), this.subs.crashlytics, this.purchase, this.billing, this.mopub);
        this.isPro.add(new WeakReference(inputConnectionC8406l));
        return inputConnectionC8406l;
    }
}
