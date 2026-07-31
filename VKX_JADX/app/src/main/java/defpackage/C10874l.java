package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10874l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21979l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21980l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f21981l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f21982l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21983l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21984l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f21985l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f21986l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f21987l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f21988l;

    public /* synthetic */ C10874l(C10700l c10700l, C10700l c10700l2, C10700l c10700l3, Context context, RemoteViews remoteViews, C5697l c5697l, C10700l c10700l4, C10700l c10700l5, C10700l c10700l6, C4372l c4372l, C10700l c10700l7, C10700l c10700l8, C10700l c10700l9) {
        this.f21982l = c10700l;
        this.f21979l = c10700l2;
        this.f21986l = c10700l3;
        this.f21987l = remoteViews;
        this.f21984l = c5697l;
        this.f21985l = c10700l4;
        this.f21988l = c10700l6;
        this.f21980l = c10700l8;
        this.f21981l = c10700l9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1491l c1491l;
        int i = this.f21983l;
        Object obj3 = this.f21984l;
        Object obj4 = this.f21987l;
        Object obj5 = this.f21981l;
        Object obj6 = this.f21980l;
        Object obj7 = this.f21988l;
        Serializable serializable = this.f21985l;
        Serializable serializable2 = this.f21986l;
        Object obj8 = this.f21979l;
        Serializable serializable3 = this.f21982l;
        switch (i) {
            case 0:
                C10700l c10700l = (C10700l) serializable3;
                C10700l c10700l2 = (C10700l) obj8;
                C10700l c10700l3 = (C10700l) serializable2;
                RemoteViews remoteViews = (RemoteViews) obj4;
                C5697l c5697l = (C5697l) obj3;
                C10700l c10700l4 = (C10700l) serializable;
                C10700l c10700l5 = (C10700l) obj7;
                C10700l c10700l6 = (C10700l) obj6;
                C10700l c10700l7 = (C10700l) obj5;
                InterfaceC0084l interfaceC0084l = (InterfaceC0084l) obj2;
                if (interfaceC0084l instanceof C10847l) {
                    if (c10700l.f21708l != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    c10700l.f21708l = interfaceC0084l;
                } else if (interfaceC0084l instanceof C8079l) {
                    c10700l2.f21708l = interfaceC0084l;
                } else if (interfaceC0084l instanceof C4538l) {
                    c10700l3.f21708l = interfaceC0084l;
                } else if (interfaceC0084l instanceof InterfaceC15267l) {
                    InterfaceC15267l interfaceC15267l = (InterfaceC15267l) interfaceC0084l;
                    int i2 = c5697l.yandex;
                    if (interfaceC15267l instanceof C3203l) {
                        remoteViews.setInt(i2, "setBackgroundResource", ((C3203l) interfaceC15267l).yandex.yandex);
                    } else {
                        if (!(interfaceC15267l instanceof C9768l)) {
                            C18725l.billing();
                            return null;
                        }
                        int i3 = ((C9768l) interfaceC15267l).yandex.yandex;
                        if (Build.VERSION.SDK_INT >= 31) {
                            AbstractC7227l.amazon(remoteViews, i2, "setBackgroundColor", i3);
                        } else {
                            remoteViews.setInt(i2, "setBackgroundResource", i3);
                        }
                    }
                } else if (interfaceC0084l instanceof C1491l) {
                    C1491l c1491l2 = (C1491l) c10700l4.f21708l;
                    if (c1491l2 != null) {
                        C1491l c1491l3 = (C1491l) interfaceC0084l;
                        c1491l = new C1491l(c1491l2.yandex.yandex(c1491l3.yandex), c1491l2.loadAd.yandex(c1491l3.loadAd), c1491l2.crashlytics.yandex(c1491l3.crashlytics), c1491l2.amazon.yandex(c1491l3.amazon), c1491l2.purchase.yandex(c1491l3.purchase), c1491l2.billing.yandex(c1491l3.billing));
                    } else {
                        c1491l = (C1491l) interfaceC0084l;
                    }
                    c10700l4.f21708l = c1491l;
                } else if (interfaceC0084l instanceof C14646l) {
                    c10700l5.f21708l = ((C14646l) interfaceC0084l).yandex;
                } else if (!(interfaceC0084l instanceof C8479l) && !(interfaceC0084l instanceof C14732l)) {
                    if (interfaceC0084l instanceof AbstractC13150l) {
                        c10700l6.f21708l = interfaceC0084l;
                    } else if (interfaceC0084l instanceof C15827l) {
                        c10700l7.f21708l = interfaceC0084l;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + interfaceC0084l + "', nothing done.");
                    }
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC8007l.crashlytics((String) serializable3, (InterfaceC0582l) obj8, (C0059l) serializable2, (C0059l) serializable, (Function1) obj7, (Function1) obj6, (C15578l) obj5, (C15578l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(114819073));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C10874l(String str, InterfaceC0582l interfaceC0582l, C0059l c0059l, C0059l c0059l2, Function1 function1, Function1 function2, C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, int i) {
        this.f21982l = str;
        this.f21979l = interfaceC0582l;
        this.f21986l = c0059l;
        this.f21985l = c0059l2;
        this.f21988l = function1;
        this.f21980l = function2;
        this.f21981l = c15578l;
        this.f21987l = c15578l2;
        this.f21984l = interfaceC17242l;
    }
}
