package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13350l extends AbstractC0294l {
    public static final int premium;
    public int Signature;
    public AbstractC1186l ad;
    public C6649l adcel;
    public final C3726l admob;
    public final boolean ads;
    public AbstractC1186l advert;
    public final HandlerC8616l firebase;
    public final C18338l isPro;
    public C14023l isVip;
    public C8662l license;
    public final C13773l metrica;
    public final C12014l mopub;
    public final Bundle pro;
    public final C8384l remoteconfig;
    public C16616l signatures;
    public final boolean smaato;
    public final ComponentName startapp;
    public final C1770l subs;
    public volatile long subscription;
    public C18338l tapsense;
    public final C0458l vip;

    static {
        premium = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:4:0x0067  */
    public C13350l(C3726l c3726l, Uri uri, Handler handler, Bundle bundle, boolean z, AbstractC1186l abstractC1186l, AbstractC1186l abstractC1186l2, C14023l c14023l, C16616l c16616l, Bundle bundle2) {
        boolean z2;
        ComponentName componentName;
        ComponentName componentNameM3631new;
        PendingIntent broadcast;
        super(0);
        int i = 0;
        this.admob = c3726l;
        this.ads = z;
        this.ad = abstractC1186l;
        this.advert = abstractC1186l2;
        this.isVip = c14023l;
        this.signatures = c16616l;
        this.pro = new Bundle(bundle2);
        Context context = c3726l.billing;
        this.subs = C1770l.firebase(context);
        C18338l c18338l = new C18338l();
        c18338l.f35849l = this;
        c18338l.f35847l = C3852l.f7980private;
        c18338l.f35846l = "";
        c18338l.f35848l = -9223372036854775807L;
        this.isPro = c18338l;
        C12014l c12014l = new C12014l(c3726l);
        this.mopub = c12014l;
        this.subscription = 300000L;
        this.firebase = new HandlerC8616l(c3726l.smaato.getLooper(), c12014l);
        int i2 = Build.VERSION.SDK_INT;
        boolean z3 = true;
        if (i2 < 33) {
            z2 = false;
        } else {
            String str = AbstractC15323l.yandex;
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                z2 = false;
            } else {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        this.smaato = z2;
        if (!abstractC1186l2.isEmpty()) {
            m3636import();
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                C8936l.admob(listQueryBroadcastReceivers.size(), "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found ");
                throw null;
            }
            componentName = null;
        }
        this.startapp = componentName;
        if (componentName == null || i2 < 31) {
            componentNameM3631new = m3631new(context, "androidx.media3.session.MediaLibraryService");
            componentNameM3631new = componentNameM3631new == null ? m3631new(context, "androidx.media3.session.MediaSessionService") : componentNameM3631new;
            if (componentNameM3631new == null || componentNameM3631new.equals(componentName)) {
                z3 = false;
            }
        } else {
            z3 = false;
            componentNameM3631new = componentName;
        }
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameM3631new == null) {
            C13773l c13773l = new C13773l(4, this);
            this.metrica = c13773l;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            String scheme = uri.getScheme();
            String str3 = AbstractC15323l.yandex;
            intentFilter.addDataScheme(scheme);
            if (i2 < 33) {
                context.registerReceiver(c13773l, intentFilter);
            } else {
                context.registerReceiver(c13773l, intentFilter, 4);
            }
            intent2.setPackage(context.getPackageName());
            broadcast = PendingIntent.getBroadcast(context, 0, intent2, premium);
            componentNameM3631new = new ComponentName(context, context.getClass());
        } else {
            intent2.setComponent(componentNameM3631new);
            if (z3) {
                broadcast = i2 >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, premium) : PendingIntent.getService(context, 0, intent2, premium);
            } else {
                broadcast = PendingIntent.getBroadcast(context, 0, intent2, premium);
            }
            this.metrica = null;
        }
        C0458l c0458l = new C0458l(context, TextUtils.join(".", new String[]{"androidx.media3.session.id", c3726l.subs}), i2 >= 31 ? null : componentNameM3631new, i2 < 31 ? broadcast : null, bundle);
        this.vip = c0458l;
        if (i2 >= 31 && componentName != null) {
            AbstractC12148l.m3365strictfp(c0458l, componentName);
        }
        PendingIntent pendingIntent = c3726l.Signature;
        if (pendingIntent != null) {
            ((C1139l) c0458l.f1691l).yandex.setSessionActivity(pendingIntent);
        }
        c0458l.m553private(this, handler);
        this.remoteconfig = z2 ? new C8384l(context, new RunnableC15296l(this, i)) : null;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static void m3628class(C0458l c0458l, C8937l c8937l) {
        C1139l c1139l = (C1139l) c0458l.f1691l;
        c1139l.subs = c8937l;
        MediaSession mediaSession = c1139l.yandex;
        Bundle bundle = c8937l.f18410l;
        if (c8937l.f18409l == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) C8937l.f18407l.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            c8937l.f18409l = builder.build();
        }
        mediaSession.setMetadata(c8937l.f18409l);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static void m3629continue(C0458l c0458l, ArrayList arrayList) {
        if (arrayList != null) {
            c0458l.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j = ((C10517l) it.next()).f21398l;
                if (hashSet.contains(Long.valueOf(j))) {
                    AbstractC6427l.subs("MediaSessionCompat", AbstractC2812l.ads(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        C1139l c1139l = (C1139l) c0458l.f1691l;
        MediaSession mediaSession = c1139l.yandex;
        c1139l.admob = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C10517l c10517l = (C10517l) it2.next();
            MediaSession.QueueItem queueItem = c10517l.f21397l;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(c10517l.f21399l.loadAd(), c10517l.f21398l);
                c10517l.f21397l = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static C2427l m3630interface(String str, Uri uri, String str2, Bundle bundle) {
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        C0554l c0554l = new C0554l();
        c0554l.f1958l = uri;
        c0554l.f1957l = str2;
        c0554l.f1956l = bundle;
        return new C2427l(str3, new C9202l(c0935l), null, new C7828l(c2410l), C3852l.f7980private, new C11470l(c0554l));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static ComponentName m3631new(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.AbstractC0294l
    public final void Signature() {
        m3633default(2, new C14240l(this, 6), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3632abstract() {
        Bundle bundle = this.pro;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        m3636import();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((C1139l) this.vip.f1691l).yandex.setExtras(bundle);
    }

    @Override // defpackage.AbstractC0294l
    public final void ad(Uri uri, Bundle bundle) {
        m3635goto(m3630interface(null, uri, null, bundle), true, false);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // defpackage.AbstractC0294l
    public final void admob(String str, Bundle bundle) {
        boolean zBooleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        C12417l c12417l = new C12417l(str, bundle);
        boolean zVip = C14869l.vip(str);
        C0458l c0458l = this.vip;
        byte b = 0;
        if (!zVip) {
            m3634final(c12417l, 0, new C17706l(this, c12417l, bundle, 10), ((C1139l) c0458l.f1691l).crashlytics());
            return;
        }
        try {
            C14869l c14869lAmazon = C14869l.amazon(c12417l);
            int i = c14869lAmazon.loadAd;
            Object obj = c14869lAmazon.isPro;
            if (!c14869lAmazon.loadAd()) {
                AbstractC6427l.vip("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            C12417l c12417l2 = c14869lAmazon.yandex;
            if (c12417l2 != null) {
                AbstractC12442l.subscription(c12417l2.yandex == 40010);
                obj.getClass();
                m3634final(null, 40010, new C5131l(this, (AbstractC7778l) obj, 29), ((C1139l) c0458l.f1691l).crashlytics());
                return;
            }
            C18602l c18602l = this.admob.tapsense;
            if (i != 1) {
                zBooleanValue = false;
            } else if (obj != null) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (c18602l.startapp()) {
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                m3633default(1, new C14240l(this, 5), ((C1139l) c0458l.f1691l).crashlytics(), false);
            } else if (i != 31) {
                m3633default(i, new C15263l(this, c14869lAmazon, b == true ? 1 : 0), ((C1139l) c0458l.f1691l).crashlytics(), true);
            } else {
                obj.getClass();
                m3635goto((C2427l) obj, false, false);
            }
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + c12417l.loadAd, e);
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void ads(String str, Bundle bundle) {
        m3635goto(m3630interface(str, null, null, bundle), true, true);
    }

    @Override // defpackage.AbstractC0294l
    public final void advert(C0579l c0579l) {
        if (c0579l == null) {
            return;
        }
        m3633default(20, new C15263l(this, c0579l, 1), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    public final void amazon(C0579l c0579l) {
        if (c0579l != null) {
            m3633default(20, new C0743l(this, c0579l, -1), ((C1139l) this.vip.f1691l).crashlytics(), false);
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void appmetrica(float f) {
        if (f <= 0.0f) {
            return;
        }
        m3633default(13, new C11525l(this, f), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    public final void billing(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.admob.isPro.loadAd());
        } else {
            C12417l c12417l = new C12417l(str, Bundle.EMPTY);
            m3634final(c12417l, 0, new C0615l(this, c12417l, bundle, resultReceiver), ((C1139l) this.vip.f1691l).crashlytics());
        }
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: catch */
    public final void mo410catch() {
        m3633default(3, new C14240l(this, 7), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m3633default(final int i, final InterfaceC0119l interfaceC0119l, final C16701l c16701l, final boolean z) {
        C3726l c3726l = this.admob;
        if (c3726l.metrica()) {
            return;
        }
        if (c16701l != null) {
            AbstractC15323l.m3966final(c3726l.smaato, new Runnable() { // from class: lؚِ٘
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0119l interfaceC0119l2 = interfaceC0119l;
                    C13350l c13350l = this.f34576l;
                    C3726l c3726l2 = c13350l.admob;
                    if (c3726l2.metrica()) {
                        return;
                    }
                    boolean zIsActive = ((C1139l) c13350l.vip.f1691l).yandex.isActive();
                    int i2 = i;
                    C16701l c16701l2 = c16701l;
                    if (!zIsActive) {
                        StringBuilder sbSignature = AbstractC2812l.Signature("Ignore incoming player command before initialization. command=", i2, ", pid=");
                        sbSignature.append(c16701l2.yandex.loadAd);
                        AbstractC6427l.vip("MediaSessionLegacyStub", sbSignature.toString());
                        return;
                    }
                    C6499l c6499lM3639super = c13350l.m3639super(c16701l2);
                    if (!c13350l.mopub.m3304native(c6499lM3639super, i2)) {
                        if (i2 != 1 || c3726l2.tapsense.startapp()) {
                            return;
                        }
                        AbstractC6427l.vip("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    C15035l c15035l = c3726l2.purchase;
                    c3726l2.m1421volatile(c6499lM3639super);
                    c15035l.getClass();
                    try {
                        interfaceC0119l2.crashlytics(c6499lM3639super);
                    } catch (RemoteException e) {
                        AbstractC6427l.metrica("MediaSessionLegacyStub", "Exception in " + c6499lM3639super, e);
                    }
                    if (z) {
                        new SparseBooleanArray().append(i2, true);
                        c3726l2.signatures(c6499lM3639super);
                    }
                }
            });
            return;
        }
        AbstractC6427l.billing("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m3634final(C12417l c12417l, int i, InterfaceC0119l interfaceC0119l, C16701l c16701l) {
        Object objValueOf;
        if (c16701l != null) {
            AbstractC15323l.m3966final(this.admob.smaato, new RunnableC4985l(this, c12417l, i, c16701l, interfaceC0119l));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        if (c12417l == null) {
            objValueOf = c12417l;
            objValueOf = Integer.valueOf(i);
        }
        objValueOf = c12417l;
        sb.append(objValueOf);
        AbstractC6427l.billing("MediaSessionLegacyStub", sb.toString());
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m3635goto(C2427l c2427l, boolean z, boolean z2) {
        m3633default(31, new C10792l(this, c2427l, z, z2), ((C1139l) this.vip.f1691l).crashlytics(), false);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m3636import() {
        C8384l c8384l;
        this.ad = C14869l.isPro(C14869l.mopub(this.advert, this.isVip, this.signatures), true, true, 9);
        boolean z = this.smaato;
        Bundle bundle = this.pro;
        if (z && ((c8384l = this.remoteconfig) == null || !c8384l.purchase.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.ad.isEmpty() || C14869l.crashlytics(2, this.ad)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !C14869l.crashlytics(2, this.ad));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !C14869l.crashlytics(3, this.ad));
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void inmobi(C10388l c10388l) {
        mo418throws(c10388l);
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m3637instanceof(C18602l c18602l) {
        AbstractC15323l.m3966final(this.admob.smaato, new RunnableC4159l(this, c18602l, 1));
    }

    @Override // defpackage.AbstractC0294l
    public final boolean isPro(Intent intent) {
        C16701l c16701lCrashlytics = ((C1139l) this.vip.f1691l).crashlytics();
        c16701lCrashlytics.getClass();
        return this.admob.advert(new C6499l(c16701lCrashlytics, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.AbstractC0294l
    public final void isVip() {
        m3633default(11, new C14240l(this, 4), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    public final void license(String str, Bundle bundle) {
        m3635goto(m3630interface(str, null, null, bundle), true, false);
    }

    @Override // defpackage.AbstractC0294l
    public final void metrica() {
        m3633default(1, new C14240l(this, 5), ((C1139l) this.vip.f1691l).crashlytics(), false);
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: package */
    public final void mo412package(int i) {
        m3633default(15, new C13859l(this, i, 0), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: private */
    public final void mo413private() {
        boolean zMo2779l = this.admob.tapsense.mo2779l(7);
        C0458l c0458l = this.vip;
        if (zMo2779l) {
            m3633default(7, new C14240l(this, 1), ((C1139l) c0458l.f1691l).crashlytics(), true);
        } else {
            m3633default(6, new C14240l(this, 2), ((C1139l) c0458l.f1691l).crashlytics(), true);
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void pro(String str, Bundle bundle) {
        m3635goto(m3630interface(null, null, str, bundle), true, false);
    }

    @Override // defpackage.AbstractC0294l
    public final void purchase(C0579l c0579l, int i) {
        if (c0579l != null) {
            if (i == -1 || i >= 0) {
                m3633default(20, new C0743l(this, c0579l, i), ((C1139l) this.vip.f1691l).crashlytics(), false);
            }
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void signatures(long j) {
        m3633default(5, new C13778l(this, j, 1), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    public final void smaato() {
        m3633default(1, new C14240l(this, 10), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final C16830l m3638static(C18602l c18602l) {
        long j;
        ?? r23;
        int i;
        int iMopub;
        String message;
        Bundle bundle;
        long j2;
        int i2;
        long j3;
        C8662l c8662l = this.license;
        Bundle bundle2 = this.pro;
        if (c8662l != null && c8662l.crashlytics) {
            new Bundle((Bundle) c8662l.purchase).putAll(bundle2);
            ArrayList arrayList = new ArrayList();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = c8662l.loadAd;
            String str = (String) c8662l.amazon;
            str.getClass();
            return new C16830l(7, -1L, 0L, 0.0f, 0L, i3, str, jElapsedRealtime, arrayList, -1L, (Bundle) c8662l.purchase);
        }
        C14723l c14723lMo2807switch = c18602l.mo2807switch();
        int i4 = 1;
        boolean z = c18602l.mo2779l(16) && !c18602l.mo2777l();
        boolean z2 = c14723lMo2807switch != null || AbstractC15323l.m3971instanceof(c18602l, this.ads);
        C16830l c16830l = null;
        int i5 = 7;
        if (c14723lMo2807switch == null) {
            AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
            if (c18602l.mo2807switch() == null) {
                int iPurchase = c18602l.purchase();
                if (iPurchase == 1) {
                    i5 = 0;
                } else if (iPurchase != 2) {
                    if (iPurchase != 3) {
                        if (iPurchase != 4) {
                            C8339l.metrica(AbstractC0653l.vip(iPurchase, "Unrecognized State: "));
                            return null;
                        }
                        i5 = 1;
                    } else if (z2) {
                        i5 = 2;
                    } else {
                        i5 = 3;
                    }
                } else if (z2) {
                    i5 = 2;
                } else {
                    i5 = 6;
                }
            }
        }
        int i6 = i5;
        C16616l c16616lAmazon = AbstractC8672l.amazon(this.signatures, c18602l.vip());
        long j4 = 128;
        int i7 = 0;
        while (i7 < c16616lAmazon.yandex.yandex.size()) {
            int iLoadAd = c16616lAmazon.yandex.loadAd(i7);
            if (iLoadAd == i4) {
                j3 = z2 ? 516L : 514L;
            } else if (iLoadAd == 2) {
                j3 = 16384;
            } else if (iLoadAd == 3) {
                j3 = 1;
            } else if (iLoadAd != 31) {
                switch (iLoadAd) {
                    case 5:
                        j3 = 256;
                        break;
                    case 6:
                    case 7:
                        j3 = 16;
                        break;
                    case 8:
                    case 9:
                        j3 = 32;
                        break;
                    case 10:
                        j3 = 4096;
                        break;
                    case 11:
                        j3 = 8;
                        break;
                    case 12:
                        j3 = 64;
                        break;
                    case 13:
                        j3 = 4194304;
                        break;
                    case 14:
                        j3 = 2621440;
                        break;
                    case 15:
                        j3 = 262144;
                        break;
                    default:
                        j3 = 0;
                        break;
                }
            } else {
                j3 = 240640;
            }
            j4 |= j3;
            i7++;
            i4 = 1;
        }
        if (!this.advert.isEmpty() && C14869l.crashlytics(2, this.ad)) {
            j4 &= -17;
        }
        if (!this.advert.isEmpty() && C14869l.crashlytics(3, this.ad)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        if (c18602l.mo2779l(17)) {
            int iMo2761implements = c18602l.mo2761implements();
            AbstractC8481l abstractC8481l2 = AbstractC18585l.yandex;
            j = iMo2761implements == -1 ? -1L : iMo2761implements;
        } else {
            j = -1;
        }
        float f = c18602l.billing().yandex;
        float f2 = (c18602l.mo2758finally() && z) ? f : 0.0f;
        Bundle bundle3 = c14723lMo2807switch != null ? new Bundle(c14723lMo2807switch.f28795l) : new Bundle();
        if (c14723lMo2807switch == null && c8662l != null) {
            bundle3.putAll((Bundle) c8662l.purchase);
        }
        bundle3.putAll(bundle2);
        bundle3.putFloat("EXO_SPEED", f);
        C2427l c2427lM4567l = c18602l.m4567l();
        if (c2427lM4567l != null) {
            String str2 = c2427lM4567l.yandex;
            if (!"".equals(str2)) {
                bundle3.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long jMo2771l = z ? c18602l.mo2771l() : -1L;
        long jMo2798new = z ? c18602l.mo2798new() : -1L;
        ArrayList arrayList2 = new ArrayList();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        int i8 = 0;
        while (i8 < this.ad.size()) {
            C14869l c14869l = (C14869l) this.ad.get(i8);
            C12417l c12417l = c14869l.yandex;
            Uri uri = c14869l.purchase;
            C16830l c16830l2 = c16830l;
            int i9 = c14869l.crashlytics;
            Bundle bundle4 = c14869l.mopub;
            int i10 = i8;
            if (c12417l != null) {
                Bundle bundle5 = c12417l.crashlytics;
                bundle = bundle3;
                String str3 = c12417l.loadAd;
                j2 = jMo2771l;
                if (c14869l.subs && c12417l.yandex == 0) {
                    C14023l c14023l = this.isVip;
                    if ((c12417l != null && c14023l.yandex.contains(c12417l)) || (((i2 = c14869l.loadAd) != -1 && c16616lAmazon.yandex(i2)) || C14869l.vip(str3))) {
                        boolean z3 = i9 != 0;
                        boolean z4 = uri != null;
                        if (z3 || z4 || !bundle4.isEmpty()) {
                            bundle5 = new Bundle(bundle5);
                        }
                        if (!bundle4.isEmpty()) {
                            bundle5.putAll(bundle4);
                        }
                        if (z3) {
                            bundle5.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i9);
                        }
                        if (z4) {
                            uri.getClass();
                            bundle5.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", uri.toString());
                        }
                        CharSequence charSequence = c14869l.billing;
                        int i11 = c14869l.amazon;
                        if (TextUtils.isEmpty(str3)) {
                            C8339l.metrica("You must specify an action to build a CustomAction");
                            return c16830l2;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            C8339l.metrica("You must specify a name to build a CustomAction");
                            return c16830l2;
                        }
                        if (i11 == 0) {
                            C8339l.metrica("You must specify an icon resource id to build a CustomAction");
                            return c16830l2;
                        }
                        arrayList2.add(new C5388l(str3, charSequence, i11, bundle5));
                    }
                }
            } else {
                bundle = bundle3;
                j2 = jMo2771l;
            }
            i8 = i10 + 1;
            c16830l = c16830l2;
            bundle3 = bundle;
            jMo2771l = j2;
        }
        Bundle bundle6 = bundle3;
        C16830l c16830l3 = c16830l;
        long j6 = jMo2771l;
        if (c14723lMo2807switch == null) {
            if (c8662l != null) {
                iMopub = c8662l.loadAd;
                message = (String) c8662l.amazon;
            } else {
                r23 = c16830l3;
                i = 0;
            }
            return new C16830l(i6, j6, jMo2798new, f2, j5, i, r23, jElapsedRealtime2, arrayList2, j, bundle6);
        }
        AbstractC8481l abstractC8481l3 = AbstractC18585l.yandex;
        iMopub = AbstractC18585l.mopub(c14723lMo2807switch.f28797l);
        message = c14723lMo2807switch.getMessage();
        i = iMopub;
        r23 = message;
        return new C16830l(i6, j6, jMo2798new, f2, j5, i, r23, jElapsedRealtime2, arrayList2, j, bundle6);
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: strictfp */
    public final void mo414strictfp() {
        boolean zMo2779l = this.admob.tapsense.mo2779l(9);
        C0458l c0458l = this.vip;
        if (zMo2779l) {
            m3633default(9, new C14240l(this, 3), ((C1139l) c0458l.f1691l).crashlytics(), true);
        } else {
            m3633default(8, new C14240l(this, 8), ((C1139l) c0458l.f1691l).crashlytics(), true);
        }
    }

    @Override // defpackage.AbstractC0294l
    public final void subs() {
        m3633default(12, new C14240l(this, 9), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    public final void subscription(String str, Bundle bundle) {
        m3635goto(m3630interface(null, null, str, bundle), true, true);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final C6499l m3639super(C16701l c16701l) {
        C6499l c6499lLicense = this.mopub.license(c16701l);
        if (c6499lLicense == null) {
            C6499l c6499l = new C6499l(c16701l, 0, 0, this.subs.smaato(c16701l), new C12947l(c16701l), Bundle.EMPTY);
            C3764l c3764lSubscription = this.admob.subscription(c6499l);
            this.mopub.mopub(c16701l, c6499l, c3764lSubscription.yandex, c3764lSubscription.loadAd);
            this.admob.premium(c6499l);
            c6499lLicense = c6499l;
        }
        HandlerC8616l handlerC8616l = this.firebase;
        long j = this.subscription;
        handlerC8616l.removeMessages(1001, c6499lLicense);
        handlerC8616l.sendMessageDelayed(handlerC8616l.obtainMessage(1001, c6499lLicense), j);
        return c6499lLicense;
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: synchronized */
    public final void mo416synchronized(int i) {
        m3633default(14, new C13859l(this, i, 1), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    public final void tapsense(Uri uri, Bundle bundle) {
        m3635goto(m3630interface(null, uri, null, bundle), true, true);
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: throw */
    public final void mo417throw(long j) {
        if (j < 0) {
            return;
        }
        m3633default(10, new C13778l(this, j, 0), ((C1139l) this.vip.f1691l).crashlytics(), true);
    }

    @Override // defpackage.AbstractC0294l
    /* JADX INFO: renamed from: throws */
    public final void mo418throws(C10388l c10388l) {
        AbstractC7778l abstractC7778lAdcel = AbstractC18585l.adcel(c10388l);
        if (abstractC7778lAdcel != null) {
            m3634final(null, 40010, new C5131l(this, abstractC7778lAdcel, 29), ((C1139l) this.vip.f1691l).crashlytics());
            return;
        }
        AbstractC6427l.vip("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + c10388l);
    }
}
