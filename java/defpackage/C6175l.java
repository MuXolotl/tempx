package defpackage;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6175l implements RemoteViewsService.RemoteViewsFactory {
    public final String amazon;
    public final int crashlytics;
    public final int loadAd;
    public final GlanceRemoteViewsService yandex;

    public C6175l(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.yandex = glanceRemoteViewsService;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r10 == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r8.mo2158switch(r5) == r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yandex(defpackage.C6175l r10, defpackage.C3445l r11, defpackage.AbstractC0283l r12) {
        /*
            androidx.glance.appwidget.GlanceRemoteViewsService r1 = r10.yandex
            int r6 = r10.loadAd
            boolean r0 = r12 instanceof defpackage.C11959l
            if (r0 == 0) goto L18
            r0 = r12
            lُِٛ r0 = (defpackage.C11959l) r0
            int r2 = r0.f23835l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r0.f23835l = r2
        L16:
            r5 = r0
            goto L1e
        L18:
            lُِٛ r0 = new lُِٛ
            r0.<init>(r10, r12)
            goto L16
        L1e:
            java.lang.Object r10 = r5.f23834l
            int r12 = r5.f23835l
            r7 = 3
            r0 = 1
            r8 = 0
            lٍؗؐ r9 = defpackage.EnumC9342l.f19165l
            if (r12 == 0) goto L46
            if (r12 == r0) goto L42
            r11 = 2
            if (r12 == r11) goto L3b
            if (r12 != r7) goto L35
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L9c
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            return r8
        L3b:
            defpackage.AbstractC2829l.crashlytics(r10)
            r8 = r10
            lٌؚؖ r8 = (defpackage.InterfaceC7042l) r8
            goto L91
        L42:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L85
        L46:
            defpackage.AbstractC2829l.crashlytics(r10)
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r1)
            android.appwidget.AppWidgetProviderInfo r10 = r10.getAppWidgetInfo(r6)
            if (r10 == 0) goto L70
            android.content.ComponentName r10 = r10.provider
            if (r10 == 0) goto L70
            java.lang.String r10 = r10.getClassName()
            if (r10 == 0) goto L70
            java.lang.Class r10 = java.lang.Class.forName(r10)
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r8)
            java.lang.Object r10 = r10.newInstance(r8)
            lّۜؑ r10 = (defpackage.AbstractC12866l) r10
            lؘؘؚ r10 = r10.purchase()
            goto L71
        L70:
            r10 = r8
        L71:
            if (r10 == 0) goto L8c
            lٕٔؕ r4 = new lٕٔؕ
            r12 = 4
            r4.<init>(r12, r8, r0)
            r5.f23835l = r0
            r3 = 0
            r0 = r10
            r2 = r11
            java.lang.Object r10 = r0.amazon(r1, r2, r3, r4, r5)
            if (r10 != r9) goto L85
            goto L9b
        L85:
            lٌؚؖ r10 = (defpackage.InterfaceC7042l) r10
            if (r10 != 0) goto L8a
            goto L8c
        L8a:
            r8 = r10
            goto L91
        L8c:
            lؘۦؐ r10 = androidx.glance.appwidget.UnmanagedSessionReceiver.yandex
            defpackage.C6096l.amazon(r6)
        L91:
            if (r8 == 0) goto L9f
            r5.f23835l = r7
            java.lang.Object r10 = r8.mo2158switch(r5)
            if (r10 != r9) goto L9c
        L9b:
            return r9
        L9c:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L9f:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6175l.yandex(lؙؑؐ, lؕ٘ؑ, lّؑۧ):java.lang.Object");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return loadAd().yandex.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return loadAd().yandex[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return loadAd().loadAd[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.yandex.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return loadAd().crashlytics;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        loadAd().getClass();
        return false;
    }

    public final C0997l loadAd() {
        C0997l c0997l;
        C5183l c5183l = GlanceRemoteViewsService.f418l;
        int i = this.loadAd;
        int i2 = this.crashlytics;
        String str = this.amazon;
        C5183l c5183l2 = GlanceRemoteViewsService.f418l;
        synchronized (c5183l2) {
            c0997l = (C0997l) c5183l2.yandex.get(C5183l.loadAd(i, i2, str));
            if (c0997l == null) {
                c0997l = C0997l.amazon;
            }
        }
        return c0997l;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        AbstractC10999l.admob(new C8912l(this, null, 4));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        C5183l c5183l = GlanceRemoteViewsService.f418l;
        int i = this.loadAd;
        int i2 = this.crashlytics;
        String str = this.amazon;
        C5183l c5183l2 = GlanceRemoteViewsService.f418l;
        synchronized (c5183l2) {
            c5183l2.yandex.remove(C5183l.loadAd(i, i2, str));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
