package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًَٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10167l {
    public final C16399l admob;
    public final boolean amazon;
    public final C4397l billing;
    public final C0639l crashlytics;
    public final Function1 firebase;
    public final C12899l isPro = AbstractC16955l.yandex;
    public final C16173l loadAd;
    public final InterfaceC4005l mopub;
    public final boolean purchase;
    public final int smaato;
    public final C8550l subs;
    public final C17812l yandex;

    public C10167l(C17812l c17812l, C16173l c16173l, C0639l c0639l, boolean z, boolean z2, C4397l c4397l, InterfaceC4005l interfaceC4005l, C16399l c16399l, C8550l c8550l, Function1 function1, int i) {
        this.yandex = c17812l;
        this.loadAd = c16173l;
        this.crashlytics = c0639l;
        this.amazon = z;
        this.purchase = z2;
        this.billing = c4397l;
        this.mopub = interfaceC4005l;
        this.admob = c16399l;
        this.subs = c8550l;
        this.firebase = function1;
        this.smaato = i;
    }

    public final void yandex(List list) {
        C18595l c18595l = this.yandex.amazon;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new C2680l());
        this.firebase.invoke(c18595l.loadAd(arrayList));
    }
}
