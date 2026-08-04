package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: lّۜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12866l extends AppWidgetProvider {
    public final C16552l yandex = AbstractC11463l.yandex;

    public final Object amazon(InterfaceC2262l interfaceC2262l, Context context, int[] iArr, AbstractC5563l abstractC5563l) {
        billing(interfaceC2262l, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(AbstractC10999l.crashlytics(3, null, interfaceC2262l, new C13941l(this, context, i, null)));
        }
        Object objYandex = AbstractC15342l.yandex(arrayList, abstractC5563l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }

    public final void billing(InterfaceC2262l interfaceC2262l, Context context) {
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C15559l(context, this, null, 0), 3);
    }

    public final Object crashlytics(InterfaceC2262l interfaceC2262l, Context context, int i, Bundle bundle, AbstractC5563l abstractC5563l) {
        Object objAmazon;
        billing(interfaceC2262l, context);
        AbstractC5518l abstractC5518lPurchase = purchase();
        boolean z = abstractC5518lPurchase.purchase() instanceof C7261l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (z || ((Build.VERSION.SDK_INT > 31 && (abstractC5518lPurchase.purchase() instanceof C18698l)) || (objAmazon = abstractC5518lPurchase.amazon(context, new C3445l(i), bundle, new C14077l(bundle, null, 0), abstractC5563l)) != enumC9342l)) {
            objAmazon = Unit.INSTANCE;
        }
        return objAmazon == enumC9342l ? objAmazon : Unit.INSTANCE;
    }

    public final Object loadAd(InterfaceC2262l interfaceC2262l, Context context, int i, String str, AbstractC5563l abstractC5563l) {
        billing(interfaceC2262l, context);
        AbstractC5518l abstractC5518lPurchase = purchase();
        abstractC5518lPurchase.getClass();
        Object objAmazon = abstractC5518lPurchase.amazon(context, new C3445l(i), null, new C14077l(str, null, 1), abstractC5563l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objAmazon != enumC9342l) {
            objAmazon = Unit.INSTANCE;
        }
        return objAmazon == enumC9342l ? objAmazon : Unit.INSTANCE;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (AbstractC6604l.loadAd(context, new C8608l(this, i, bundle, 2))) {
            return;
        }
        AbstractC10774l.billing(this, this.yandex, new C15417l(this, context, i, bundle, null, 0));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        if (AbstractC6604l.loadAd(context, new C0304l(this, iArr, 0))) {
            return;
        }
        AbstractC10774l.billing(this, this.yandex, new C8759l(this, context, iArr, null, 0));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c A[Catch: all -> 0x00b0, CancellationException -> 0x00b9, TryCatch #2 {CancellationException -> 0x00b9, all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00ac, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a0, B:38:0x009c, B:41:0x00a4, B:42:0x00ab, B:30:0x006f), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[Catch: all -> 0x00b0, CancellationException -> 0x00b9, TryCatch #2 {CancellationException -> 0x00b9, all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00ac, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a0, B:38:0x009c, B:41:0x00a4, B:42:0x00ab, B:30:0x006f), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x00b0, CancellationException -> 0x00b9, TryCatch #2 {CancellationException -> 0x00b9, all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00ac, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a0, B:38:0x009c, B:41:0x00a4, B:42:0x00ab, B:30:0x006f), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[Catch: all -> 0x00b0, CancellationException -> 0x00b9, TryCatch #2 {CancellationException -> 0x00b9, all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0054, B:24:0x005b, B:25:0x005c, B:26:0x0063, B:27:0x0064, B:43:0x00ac, B:33:0x007a, B:35:0x008c, B:37:0x0097, B:39:0x00a0, B:38:0x009c, B:41:0x00a4, B:42:0x00ab, B:30:0x006f), top: B:49:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC12866l abstractC12866l;
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action == null) {
                abstractC12866l = this;
                context2 = context;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -19011148) {
                    abstractC12866l = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = abstractC12866l.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    abstractC12866l.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 649033583) {
                    abstractC12866l = this;
                    context2 = context;
                    if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = abstractC12866l.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    abstractC12866l.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                    String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                    if (stringExtra == null) {
                        throw new IllegalStateException("Intent is missing ActionKey extra");
                    }
                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                    if (intExtra == -1) {
                        throw new IllegalStateException("Intent is missing AppWidgetId extra");
                    }
                    if (AbstractC6604l.loadAd(context, new C8608l(this, intExtra, stringExtra, 1))) {
                        return;
                    }
                    AbstractC10774l.billing(this, this.yandex, new C15417l(this, context, intExtra, stringExtra, null, 1));
                    return;
                }
                abstractC12866l = this;
                context2 = context;
            }
            super.onReceive(context2, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (AbstractC6604l.loadAd(context, new C0304l(this, iArr, 1))) {
            return;
        }
        AbstractC10774l.billing(this, this.yandex, new C8759l(this, context, iArr, null, 1));
    }

    public abstract AbstractC5518l purchase();

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005a -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object yandex(defpackage.InterfaceC2262l r6, android.content.Context r7, int[] r8, defpackage.AbstractC0283l r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C14403l
            if (r0 == 0) goto L13
            r0 = r9
            lٟٓۚ r0 = (defpackage.C14403l) r0
            int r1 = r0.f28158l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28158l = r1
            goto L18
        L13:
            lٟٓۚ r0 = new lٟٓۚ
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f28157l
            int r1 = r0.f28158l
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            int r6 = r0.f28156l
            int r7 = r0.f28162l
            int[] r8 = r0.f28159l
            android.content.Context r1 = r0.f28160l
            defpackage.AbstractC2829l.crashlytics(r9)
            r9 = r8
            r8 = r1
            goto L5d
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            r5 = 0
            return r5
        L36:
            defpackage.AbstractC2829l.crashlytics(r9)
            r5.billing(r6, r7)
            int r6 = r8.length
            r9 = 0
            r4 = r8
            r8 = r7
            r7 = r9
            r9 = r4
        L42:
            if (r7 >= r6) goto L5f
            r1 = r9[r7]
            lؘؘؚ r3 = r5.purchase()
            r0.f28160l = r8
            r0.f28159l = r9
            r0.f28162l = r7
            r0.f28156l = r6
            r0.f28158l = r2
            java.lang.Object r1 = r3.crashlytics(r8, r1, r0)
            lٍؗؐ r3 = defpackage.EnumC9342l.f19165l
            if (r1 != r3) goto L5d
            return r3
        L5d:
            int r7 = r7 + r2
            goto L42
        L5f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12866l.yandex(lؓۦۨ, android.content.Context, int[], lّؑۧ):java.lang.Object");
    }
}
