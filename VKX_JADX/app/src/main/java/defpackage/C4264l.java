package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4264l implements InterfaceC14544l {
    public static final InterfaceC11766l admob = AbstractC15788l.purchase(new C0120l(1));
    public C8634l amazon;
    public InterfaceC9474l billing;
    public final NotificationManager crashlytics;
    public final int loadAd;
    public C3797l mopub;
    public final int purchase;
    public final Context yandex;

    public C4264l(C8662l c8662l) {
        Context context = (Context) c8662l.amazon;
        int i = c8662l.loadAd;
        this.yandex = context;
        this.loadAd = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.crashlytics = notificationManager;
        this.purchase = R.drawable.media3_notification_small_icon;
    }

    @Override // defpackage.InterfaceC14544l
    public final C1770l loadAd() {
        return new C1770l(19, this.yandex.getString(this.loadAd));
    }

    @Override // defpackage.InterfaceC14544l
    public final C16543l yandex(C13572l c13572l, AbstractC1186l abstractC1186l, C5138l c5138l, C0743l c0743l) {
        int i;
        C4264l c4264l;
        C11757l c11757l;
        C3726l c3726l;
        int i2 = this.loadAd;
        Context context = this.yandex;
        AbstractC15323l.subscription(this.crashlytics, context.getString(i2));
        InterfaceC9814l interfaceC9814lYandex = c13572l.yandex();
        C11757l c11757l2 = new C11757l(context, "default_channel_id");
        C0716l c0716l = new C0716l(c13572l);
        C16616l c16616lVip = interfaceC9814lYandex.vip();
        C3726l c3726l2 = c13572l.yandex;
        boolean z = c3726l2.startapp;
        String str = c3726l2.subs;
        boolean zM3971instanceof = AbstractC15323l.m3971instanceof(interfaceC9814lYandex, z);
        int i3 = 1;
        C13708l c13708lIsPro = C14869l.isPro(abstractC1186l, true, true, 9);
        boolean zCrashlytics = C14869l.crashlytics(2, c13708lIsPro);
        boolean zCrashlytics2 = C14869l.crashlytics(3, c13708lIsPro);
        C16971l c16971l = new C16971l(4);
        if (zCrashlytics) {
            c16971l.crashlytics((C14869l) c13708lIsPro.get(0));
            i = 1;
        } else {
            if (c16616lVip.yandex.yandex(7, 6)) {
                C3915l c3915l = new C3915l(57413);
                c3915l.crashlytics(6);
                c3915l.billing = context.getString(R.string.media3_controls_seek_to_previous_description);
                c16971l.crashlytics(c3915l.yandex());
            }
            i3 = 0;
            i = 1;
        }
        if (c16616lVip.yandex(i)) {
            if (zM3971instanceof) {
                C3915l c3915l2 = new C3915l(57399);
                c3915l2.crashlytics(i);
                c3915l2.billing = context.getString(R.string.media3_controls_play_description);
                c16971l.crashlytics(c3915l2.yandex());
            } else {
                C3915l c3915l3 = new C3915l(57396);
                c3915l3.crashlytics(i);
                c3915l3.billing = context.getString(R.string.media3_controls_pause_description);
                c16971l.crashlytics(c3915l3.yandex());
            }
        }
        if (zCrashlytics2) {
            c16971l.crashlytics((C14869l) c13708lIsPro.get(i3));
            i3++;
        } else if (c16616lVip.yandex.yandex(9, 8)) {
            C3915l c3915l4 = new C3915l(57412);
            c3915l4.crashlytics(8);
            c3915l4.billing = context.getString(R.string.media3_controls_seek_to_next_description);
            c16971l.crashlytics(c3915l4.yandex());
        }
        while (i3 < c13708lIsPro.f26765l) {
            c16971l.crashlytics((C14869l) c13708lIsPro.get(i3));
            i3++;
        }
        C13708l c13708lMopub = c16971l.mopub();
        int[] iArrCopyOf = new int[3];
        int[] iArr = new int[3];
        Arrays.fill(iArrCopyOf, -1);
        Arrays.fill(iArr, -1);
        boolean z2 = false;
        int i4 = 0;
        while (i4 < c13708lMopub.f26765l) {
            C14869l c14869l = (C14869l) c13708lMopub.get(i4);
            C12417l c12417l = c14869l.yandex;
            int i5 = c14869l.loadAd;
            Context context2 = context;
            CharSequence charSequence = c14869l.billing;
            C13708l c13708l = c13708lMopub;
            int i6 = c14869l.amazon;
            int[] iArr2 = iArr;
            C13967l c13967l = c14869l.admob;
            boolean z3 = z2;
            ArrayList arrayList = c11757l2.loadAd;
            if (c12417l != null) {
                int i7 = c12417l.yandex;
                AbstractServiceC3639l abstractServiceC3639l = (AbstractServiceC3639l) c5138l.f11181l;
                AbstractC12442l.admob(i7 == 0);
                PorterDuff.Mode mode = IconCompat.firebase;
                IconCompat iconCompatCrashlytics = IconCompat.crashlytics(abstractServiceC3639l.getResources(), abstractServiceC3639l.getPackageName(), i6);
                Class<?> cls = abstractServiceC3639l.getClass();
                AbstractC12442l.admob(i7 == 0);
                int iNextInt = ThreadLocalRandom.current().nextInt();
                AbstractC12442l.admob(i7 == 0);
                Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                intent.setData(C3726l.purchase(str));
                intent.setComponent(new ComponentName(abstractServiceC3639l, cls));
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", c12417l.loadAd);
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", c12417l.crashlytics);
                arrayList.add(new C8926l(iconCompatCrashlytics, charSequence, PendingIntent.getService(abstractServiceC3639l, iNextInt, intent, 201326592)));
            } else {
                AbstractC12442l.subscription(i5 != -1);
                PorterDuff.Mode mode2 = IconCompat.firebase;
                IconCompat iconCompatCrashlytics2 = IconCompat.crashlytics(context2.getResources(), context2.getPackageName(), i6);
                AbstractServiceC3639l abstractServiceC3639l2 = (AbstractServiceC3639l) c5138l.f11181l;
                C14122l c14122l = new C14122l(abstractServiceC3639l2, i5, abstractServiceC3639l2.getClass());
                c14122l.purchase = !c13572l.yandex().startapp();
                c14122l.billing = str;
                arrayList.add(new C8926l(iconCompatCrashlytics2, charSequence, c14122l.yandex()));
            }
            int i8 = c14869l.mopub.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
            if (i8 < 0 || i8 >= 3) {
                if (c13967l.loadAd(0) == 2) {
                    iArr2[0] = i4;
                } else {
                    if (c13967l.loadAd(0) == 1) {
                        iArr2[1] = i4;
                    } else if (c13967l.loadAd(0) == 3) {
                        iArr2[2] = i4;
                    }
                    z2 = z3;
                }
                z2 = z3;
            } else {
                iArrCopyOf[i8] = i4;
                z2 = true;
            }
            i4++;
            context = context2;
            c13708lMopub = c13708l;
            iArr = iArr2;
            c11757l2 = c11757l2;
            c3726l2 = c3726l2;
            interfaceC9814lYandex = interfaceC9814lYandex;
        }
        InterfaceC9814l interfaceC9814l = interfaceC9814lYandex;
        C11757l c11757l3 = c11757l2;
        C3726l c3726l3 = c3726l2;
        int[] iArr3 = iArr;
        if (!z2) {
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 3; i10 < i11; i11 = 3) {
                int i12 = iArr3[i10];
                if (i12 != -1) {
                    iArrCopyOf[i9] = i12;
                    i9++;
                }
                i10++;
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            if (iArrCopyOf[i13] == -1) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                break;
            }
        }
        c0716l.f2205l = iArrCopyOf;
        if (interfaceC9814l.mo2779l(18)) {
            C3852l c3852lMo2774l = interfaceC9814l.mo2774l();
            c11757l = c11757l3;
            c11757l.purchase = C11757l.crashlytics(c3852lMo2774l.yandex);
            c11757l.amazon(c3852lMo2774l.loadAd);
            c3726l = c3726l3;
            InterfaceC9474l interfaceC9474l = c3726l.remoteconfig;
            c4264l = this;
            if (c4264l.mopub == null || !interfaceC9474l.equals(c4264l.billing)) {
                c4264l.billing = interfaceC9474l;
                c4264l.mopub = new C3797l(new C14785l(interfaceC9474l, ((Integer) admob.get()).intValue(), 22));
            }
            ListenableFuture listenableFutureMo1118default = c4264l.mopub.mo1118default(c3852lMo2774l);
            if (listenableFutureMo1118default != null) {
                C8634l c8634l = c4264l.amazon;
                if (c8634l != null) {
                    c8634l.f17793l = true;
                }
                if (listenableFutureMo1118default.isDone()) {
                    try {
                        c11757l.billing((Bitmap) AbstractC7151l.crashlytics(listenableFutureMo1118default));
                    } catch (CancellationException | ExecutionException e) {
                        AbstractC6427l.vip("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                    }
                } else {
                    C8634l c8634l2 = new C8634l(c11757l, c0743l, 5);
                    c4264l.amazon = c8634l2;
                    Handler handler = c3726l.smaato;
                    Objects.requireNonNull(handler);
                    listenableFutureMo1118default.yandex(new RunnableC9929l(listenableFutureMo1118default, c8634l2, 9), new ExecutorC10366l(handler, 1));
                }
            }
        } else {
            c4264l = this;
            c11757l = c11757l3;
            c3726l = c3726l3;
        }
        long jCurrentTimeMillis = (!interfaceC9814l.mo2758finally() || interfaceC9814l.subs() || interfaceC9814l.mo2789l() || interfaceC9814l.billing().yandex != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - interfaceC9814l.mo2804static();
        boolean z4 = jCurrentTimeMillis != -9223372036854775807L;
        if (!z4) {
            jCurrentTimeMillis = 0;
        }
        Notification notification = c11757l.isVip;
        notification.when = jCurrentTimeMillis;
        c11757l.firebase = z4;
        c11757l.smaato = z4;
        if (Build.VERSION.SDK_INT >= 31) {
            c11757l.ad = 1;
        }
        c11757l.mopub = c3726l.Signature;
        c5138l.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true);
        AbstractServiceC3639l abstractServiceC3639l3 = (AbstractServiceC3639l) c5138l.f11181l;
        C14122l c14122l2 = new C14122l(abstractServiceC3639l3, 3, abstractServiceC3639l3.getClass());
        c14122l2.billing = str;
        c14122l2.mopub = bundle;
        notification.deleteIntent = c14122l2.yandex();
        c11757l.purchase(8, true);
        notification.icon = c4264l.purchase;
        c11757l.mopub(c0716l);
        c11757l.license = 1;
        c11757l.purchase(2, false);
        c11757l.adcel = "media3_group_key";
        return new C16543l(c11757l.loadAd());
    }

    @Override // defpackage.InterfaceC14544l
    public final void crashlytics() {
    }
}
