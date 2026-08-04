package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَُؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4043l {
    public final InterfaceC18579l admob;
    public final C7119l amazon;
    public final C3445l billing;
    public final AtomicBoolean crashlytics;
    public final C10086l firebase;
    public final C10086l isPro;
    public final AtomicBoolean loadAd;
    public final C18188l mopub;
    public final AbstractC5518l purchase;
    public final C0462l remoteconfig;
    public Map smaato;
    public final boolean subs;
    public final C1008l vip;
    public final String yandex;

    public C4043l(AbstractC5518l abstractC5518l, C3445l c3445l, Bundle bundle) {
        C18188l c18188l = C18188l.yandex;
        InterfaceC18579l interfaceC18579lPurchase = abstractC5518l.purchase();
        this.yandex = AbstractC13743l.crashlytics(c3445l.yandex);
        this.loadAd = new AtomicBoolean(true);
        this.crashlytics = new AtomicBoolean(false);
        this.amazon = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
        this.purchase = abstractC5518l;
        this.billing = c3445l;
        this.mopub = c18188l;
        this.admob = interfaceC18579lPurchase;
        this.subs = true;
        if (AbstractC13743l.mopub(c3445l)) {
            C8339l.metrica("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        C18450l c18450l = C18450l.f36015l;
        this.isPro = new C10086l(null, c18450l);
        this.firebase = new C10086l(bundle, c18450l);
        this.smaato = C14054l.f27396l;
        this.remoteconfig = AbstractC11174l.yandex();
        this.vip = AbstractC11190l.yandex(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object crashlytics(C4043l c4043l, Context context, Object obj, AbstractC0283l abstractC0283l) {
        C11252l c11252l;
        C1852l c1852lAppmetrica;
        C1852l c1852lAppmetrica2;
        C1852l c1852lAppmetrica3;
        if (abstractC0283l instanceof C11252l) {
            c11252l = (C11252l) abstractC0283l;
            int i = c11252l.f22677l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11252l.f22677l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11252l = new C11252l(c4043l, abstractC0283l);
            }
        } else {
            c11252l = new C11252l(c4043l, abstractC0283l);
        }
        Object objCrashlytics = c11252l.f22678l;
        int i2 = c11252l.f22677l;
        Unit unit = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            if (obj instanceof C12549l) {
                C15656l c15656lBilling = c4043l.purchase.billing();
                if (c15656lBilling != null) {
                    C18188l c18188l = c4043l.mopub;
                    String str = c4043l.yandex;
                    c11252l.f22679l = c4043l;
                    c11252l.f22677l = 1;
                    objCrashlytics = c18188l.crashlytics(context, c15656lBilling, str, c11252l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objCrashlytics == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    objCrashlytics = null;
                }
            } else if (obj instanceof C12076l) {
                AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
                C1852l c1852l = abstractC18620lIsPro instanceof C1852l ? (C1852l) abstractC18620lIsPro : null;
                if (c1852l == null || (c1852lAppmetrica2 = c1852l.appmetrica(null, null)) == null) {
                    C8339l.smaato("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    AbstractC18620l abstractC18620lIsPro2 = c1852lAppmetrica2.isPro();
                    try {
                        c4043l.firebase.setValue(((C12076l) obj).yandex);
                        Unit unit2 = Unit.INSTANCE;
                        AbstractC18620l.adcel(abstractC18620lIsPro2);
                        c1852lAppmetrica2.pro().yandex();
                        c1852lAppmetrica2.crashlytics();
                    } catch (Throwable th) {
                        AbstractC18620l.adcel(abstractC18620lIsPro2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c1852lAppmetrica2.crashlytics();
                    throw th2;
                }
            } else if (obj instanceof C10105l) {
                AbstractC18620l abstractC18620lIsPro3 = AbstractC9620l.isPro();
                C1852l c1852l2 = abstractC18620lIsPro3 instanceof C1852l ? (C1852l) abstractC18620lIsPro3 : null;
                if (c1852l2 == null || (c1852lAppmetrica = c1852l2.appmetrica(null, null)) == null) {
                    C8339l.smaato("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    AbstractC18620l abstractC18620lIsPro4 = c1852lAppmetrica.isPro();
                    try {
                        List list = (List) c4043l.smaato.get(((C10105l) obj).yandex);
                        if (list != null) {
                            Iterator it = list.iterator();
                            if (it.hasNext()) {
                                throw null;
                            }
                            unit = Unit.INSTANCE;
                        }
                        AbstractC18620l.adcel(abstractC18620lIsPro4);
                        c1852lAppmetrica.pro().yandex();
                        c1852lAppmetrica.crashlytics();
                        if (unit == null) {
                            AbstractC15300l.loadAd(Log.w("AppWidgetSession", "Triggering Action(" + ((C10105l) obj).yandex + ") for session(" + c4043l.yandex + ") failed"));
                        }
                    } catch (Throwable th3) {
                        AbstractC18620l.adcel(abstractC18620lIsPro4);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    c1852lAppmetrica.crashlytics();
                    throw th4;
                }
            } else {
                if (!(obj instanceof C4672l)) {
                    C4875l.smaato(obj.getClass(), " to AppWidgetSession", "Sent unrecognized event type ");
                    return null;
                }
                C0462l c0462l = ((C4672l) obj).yandex;
                if (c0462l.mopub()) {
                    c0462l.m561l();
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c4043l = c11252l.f22679l;
        AbstractC2829l.crashlytics(objCrashlytics);
        AbstractC18620l abstractC18620lIsPro5 = AbstractC9620l.isPro();
        C1852l c1852l3 = abstractC18620lIsPro5 instanceof C1852l ? (C1852l) abstractC18620lIsPro5 : null;
        if (c1852l3 == null || (c1852lAppmetrica3 = c1852l3.appmetrica(null, null)) == null) {
            C8339l.smaato("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            AbstractC18620l abstractC18620lIsPro6 = c1852lAppmetrica3.isPro();
            try {
                c4043l.isPro.setValue(objCrashlytics);
                Unit unit3 = Unit.INSTANCE;
                AbstractC18620l.adcel(abstractC18620lIsPro6);
                c1852lAppmetrica3.pro().yandex();
                c1852lAppmetrica3.crashlytics();
                return Unit.INSTANCE;
            } catch (Throwable th5) {
                AbstractC18620l.adcel(abstractC18620lIsPro6);
                throw th5;
            }
        } catch (Throwable th6) {
            c1852lAppmetrica3.crashlytics();
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        if (r3.loadAd(r5) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0139, code lost:
    
        if (r3.loadAd(r5) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014a, code lost:
    
        if (r3.loadAd(r5) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015e, code lost:
    
        if (r3.loadAd(r5) == r13) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object loadAd(defpackage.C4043l r21, android.content.Context r22, defpackage.AbstractC11563l r23, defpackage.AbstractC0283l r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4043l.loadAd(lَُؖ, android.content.Context, lِٖؒ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:34:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object purchase(defpackage.C4043l r6, java.util.ArrayList r7, defpackage.AbstractC0283l r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C5471l
            if (r0 == 0) goto L13
            r0 = r8
            lؘؗۖ r0 = (defpackage.C5471l) r0
            int r1 = r0.f11716l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11716l = r1
            goto L18
        L13:
            lؘؗۖ r0 = new lؘؗۖ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f11714l
            int r1 = r0.f11716l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L31
            int r6 = r0.f11710l
            int r7 = r0.f11709l
            java.util.List r1 = r0.f11715l
            lَُؖ r2 = r0.f11712l
            lَُؖ r4 = r0.f11713l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto La9
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L37:
            defpackage.AbstractC2829l.crashlytics(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r7.iterator()
        L43:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r1.next()
            boolean r5 = r4 instanceof defpackage.C10105l
            if (r5 == 0) goto L43
            r8.add(r4)
            goto L43
        L55:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5e:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r7.next()
            boolean r5 = r4 instanceof defpackage.C12076l
            if (r5 == 0) goto L5e
            r1.add(r4)
            goto L5e
        L70:
            java.lang.Object r7 = defpackage.AbstractC16901l.m4212class(r1)
            lِۙؒ r7 = (defpackage.C12076l) r7
            if (r7 == 0) goto L7a
            android.os.Bundle r2 = r7.yandex
        L7a:
            lَُؖ r7 = new lَُؖ
            lؘؘؚ r1 = r6.purchase
            lؕ٘ؑ r6 = r6.billing
            r7.<init>(r1, r6, r2)
            int r6 = r8.size()
            r1 = 0
            r2 = r7
            r4 = r2
            r7 = r1
            r1 = r8
        L8c:
            if (r7 >= r6) goto Lab
            java.lang.Object r8 = r1.get(r7)
            lَؗۗ r8 = (defpackage.C10105l) r8
            r0.f11713l = r4
            r0.f11712l = r2
            r0.f11715l = r1
            r0.f11709l = r7
            r0.f11710l = r6
            r0.f11716l = r3
            java.lang.Object r8 = r2.billing(r8, r0)
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r8 != r5) goto La9
            return r5
        La9:
            int r7 = r7 + r3
            goto L8c
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4043l.purchase(lَُؖ, java.util.ArrayList, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: lٔ۟ٞ -> 0x0081, TRY_LEAVE, TryCatch #0 {lٔ۟ٞ -> 0x0081, blocks: (B:13:0x002c, B:22:0x0051, B:26:0x0063, B:28:0x006b, B:18:0x0040, B:21:0x0047), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (crashlytics(r6, r1, r9, r0) == r4) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(android.content.Context r7, defpackage.C6411l r8, defpackage.AbstractC0283l r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C6631l
            if (r0 == 0) goto L13
            r0 = r9
            lؙٟٞ r0 = (defpackage.C6631l) r0
            int r1 = r0.f13874l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13874l = r1
            goto L18
        L13:
            lؙٟٞ r0 = new lؙٟٞ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f13870l
            int r1 = r0.f13874l
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            l٘ؓؐ r7 = r0.f13875l
            kotlin.jvm.functions.Function1 r8 = r0.f13872l
            android.content.Context r1 = r0.f13873l
            defpackage.AbstractC2829l.crashlytics(r9)     // Catch: defpackage.C15207l -> L81
        L2f:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L51
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L3a:
            l٘ؓؐ r7 = r0.f13875l
            kotlin.jvm.functions.Function1 r8 = r0.f13872l
            android.content.Context r1 = r0.f13873l
            defpackage.AbstractC2829l.crashlytics(r9)     // Catch: defpackage.C15207l -> L81
            goto L63
        L44:
            defpackage.AbstractC2829l.crashlytics(r9)
            lؚؚۖ r9 = r6.amazon     // Catch: defpackage.C15207l -> L81
            r9.getClass()     // Catch: defpackage.C15207l -> L81
            l٘ؓؐ r1 = new l٘ؓؐ     // Catch: defpackage.C15207l -> L81
            r1.<init>(r9)     // Catch: defpackage.C15207l -> L81
        L51:
            r0.f13873l = r7     // Catch: defpackage.C15207l -> L81
            r0.f13872l = r8     // Catch: defpackage.C15207l -> L81
            r0.f13875l = r1     // Catch: defpackage.C15207l -> L81
            r0.f13874l = r3     // Catch: defpackage.C15207l -> L81
            java.lang.Object r9 = r1.yandex(r0)     // Catch: defpackage.C15207l -> L81
            if (r9 != r4) goto L60
            goto L80
        L60:
            r5 = r1
            r1 = r7
            r7 = r5
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: defpackage.C15207l -> L81
            boolean r9 = r9.booleanValue()     // Catch: defpackage.C15207l -> L81
            if (r9 == 0) goto L81
            java.lang.Object r9 = r7.crashlytics()     // Catch: defpackage.C15207l -> L81
            r8.invoke(r9)     // Catch: defpackage.C15207l -> L81
            r0.f13873l = r1     // Catch: defpackage.C15207l -> L81
            r0.f13872l = r8     // Catch: defpackage.C15207l -> L81
            r0.f13875l = r7     // Catch: defpackage.C15207l -> L81
            r0.f13874l = r2     // Catch: defpackage.C15207l -> L81
            java.lang.Object r9 = crashlytics(r6, r1, r9, r0)     // Catch: defpackage.C15207l -> L81
            if (r9 != r4) goto L2f
        L80:
            return r4
        L81:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4043l.amazon(android.content.Context, lؙِ۠, lّؑۧ):java.lang.Object");
    }

    public final Object billing(Object obj, AbstractC0283l abstractC0283l) {
        Object objLoadAd = this.amazon.loadAd(abstractC0283l, obj);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mopub(AbstractC0283l abstractC0283l) {
        C5651l c5651l;
        C4672l c4672l;
        if (abstractC0283l instanceof C5651l) {
            c5651l = (C5651l) abstractC0283l;
            int i = c5651l.f12002l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5651l.f12002l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5651l = new C5651l(this, abstractC0283l);
            }
        } else {
            c5651l = new C5651l(this, abstractC0283l);
        }
        Object obj = c5651l.f12003l;
        int i2 = c5651l.f12002l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C4672l c4672l2 = new C4672l(new C0462l(this.remoteconfig));
            c5651l.f12004l = c4672l2;
            c5651l.f12002l = 1;
            Object objBilling = billing(c4672l2, c5651l);
            Object obj2 = EnumC9342l.f19165l;
            if (objBilling == obj2) {
                return obj2;
            }
            c4672l = c4672l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4672l = c5651l.f12004l;
            AbstractC2829l.crashlytics(obj);
        }
        return c4672l.yandex;
    }

    public final void yandex(Context context, Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        if (!this.subs) {
            throw th;
        }
        int i = this.billing.yandex;
        this.purchase.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }
}
