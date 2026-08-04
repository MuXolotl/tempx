package defpackage;

import android.media.MediaCodec;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٌؙٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC8616l extends Handler {
    public Object loadAd;
    public final /* synthetic */ int yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8616l(C1636l c1636l) {
        super(Looper.getMainLooper());
        this.yandex = 4;
        this.loadAd = c1636l;
    }

    private final void crashlytics(Message message) {
        C1139l c1139l;
        AbstractC0294l abstractC0294l;
        HandlerC8616l handlerC8616l;
        if (message.what == 1) {
            synchronized (((AbstractC0294l) this.loadAd).loadAd) {
                c1139l = (C1139l) ((WeakReference) ((AbstractC0294l) this.loadAd).amazon).get();
                abstractC0294l = (AbstractC0294l) this.loadAd;
                handlerC8616l = (HandlerC8616l) abstractC0294l.billing;
            }
            if (c1139l == null || abstractC0294l != c1139l.loadAd() || handlerC8616l == null) {
                return;
            }
            c1139l.amazon((C16701l) message.obj);
            ((AbstractC0294l) this.loadAd).crashlytics(c1139l, handlerC8616l);
            c1139l.amazon(null);
        }
    }

    private final void loadAd(Message message) {
        C7272l c7272l;
        AbstractC0294l abstractC0294l;
        HandlerC8616l handlerC8616l;
        if (message.what == 1) {
            synchronized (((AbstractC0294l) this.loadAd).loadAd) {
                c7272l = (C7272l) ((WeakReference) ((AbstractC0294l) this.loadAd).amazon).get();
                abstractC0294l = (AbstractC0294l) this.loadAd;
                handlerC8616l = (HandlerC8616l) abstractC0294l.billing;
            }
            if (c7272l == null || abstractC0294l != c7272l.loadAd() || handlerC8616l == null) {
                return;
            }
            c7272l.purchase((C3070l) message.obj);
            ((AbstractC0294l) this.loadAd).loadAd(c7272l, handlerC8616l);
            c7272l.purchase(null);
        }
    }

    private final void yandex(Message message) {
        C2183l c2183l;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            C15034l c15034l = (C15034l) this.loadAd;
            C3797l c3797l = c15034l.crashlytics;
            if (obj == c15034l.isVip) {
                if (c15034l.startapp == 2 || c15034l.firebase()) {
                    c15034l.isVip = null;
                    if (obj2 instanceof Exception) {
                        c3797l.m1430throws((Exception) obj2, false);
                        return;
                    }
                    try {
                        c15034l.loadAd.metrica(((C6150l) obj2).yandex);
                        c3797l.f7902l = null;
                        HashSet hashSet = (HashSet) c3797l.f7903l;
                        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(hashSet);
                        hashSet.clear();
                        C9258l c9258lListIterator = abstractC1186lSignature.listIterator(0);
                        while (c9258lListIterator.hasNext()) {
                            C15034l c15034l2 = (C15034l) c9258lListIterator.next();
                            if (c15034l2.vip()) {
                                c15034l2.isPro(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        c3797l.m1430throws(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C15034l c15034l3 = (C15034l) this.loadAd;
        if (obj == c15034l3.ad && c15034l3.firebase()) {
            c15034l3.ad = null;
            synchronized (c15034l3.metrica) {
                C16543l c16543l = c15034l3.advert;
                c16543l.getClass();
                c2183l = new C2183l(4);
                ((C16971l) c16543l.f32482l).mopub();
                c15034l3.advert = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c15034l3.remoteconfig((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((C6150l) obj2).yandex;
                byte[] bArrVip = c15034l3.loadAd.vip(c15034l3.license, bArr);
                if (c15034l3.pro != null && bArrVip != null && bArrVip.length != 0) {
                    c15034l3.pro = bArrVip;
                }
                c15034l3.startapp = 4;
                c15034l3.subs(new C2683l(19, c2183l));
            } catch (Exception e2) {
                e = e2;
                c15034l3.remoteconfig(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                c15034l3.remoteconfig(e, true);
            }
        }
    }

    public void amazon(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1229l c1229l = null;
        c1229l = null;
        c1229l = null;
        c1229l = null;
        c1229l = null;
        c1229l = null;
        boolean z = false;
        switch (this.yandex) {
            case 0:
                C17578l c17578l = (C17578l) this.loadAd;
                int i = message.what;
                if (i == 1) {
                    C1229l c1229l2 = (C1229l) message.obj;
                    try {
                        c17578l.f34211l.queueInputBuffer(c1229l2.yandex, 0, c1229l2.loadAd, c1229l2.amazon, c1229l2.purchase);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = c17578l.f34213l;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    c1229l = c1229l2;
                } else if (i == 2) {
                    C1229l c1229l3 = (C1229l) message.obj;
                    int i2 = c1229l3.yandex;
                    MediaCodec.CryptoInfo cryptoInfo = c1229l3.crashlytics;
                    long j = c1229l3.amazon;
                    int i3 = c1229l3.purchase;
                    try {
                        if (Build.VERSION.SDK_INT < 31) {
                            synchronized (C17578l.f34208l) {
                                c17578l.f34211l.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            }
                        } else {
                            c17578l.f34211l.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        }
                        break;
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = c17578l.f34213l;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    c1229l = c1229l3;
                } else if (i == 3) {
                    c17578l.f34212l.amazon();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = c17578l.f34213l;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        c17578l.f34211l.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = c17578l.f34213l;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (c1229l != null) {
                    C17578l.amazon(c1229l);
                    return;
                }
                return;
            case 1:
                yandex(message);
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (C15034l c15034l : ((C17339l) this.loadAd).f33693l) {
                    c15034l.startapp();
                    if (Arrays.equals(c15034l.license, bArr)) {
                        if (message.what == 2 && c15034l.startapp == 4) {
                            String str = AbstractC15323l.yandex;
                            c15034l.isPro(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 3:
                ServiceC16415l serviceC16415l = (ServiceC16415l) this.loadAd;
                if (serviceC16415l == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                C5008l c5008l = serviceC16415l.f32107l;
                Bundle data = message.getData();
                switch (message.what) {
                    case 3:
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC7698l(c5008l, new C15053l(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), AbstractC15323l.startapp(data.getBundle("data_options")), 0));
                        return;
                    case 4:
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC16843l(c5008l, new C15053l(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 2));
                        return;
                    case 5:
                        String string = data.getString("data_media_item_id");
                        C1102l c1102l = (C1102l) data.getParcelable("data_result_receiver");
                        C15053l c15053l = new C15053l(message.replyTo);
                        c5008l.getClass();
                        if (TextUtils.isEmpty(string) || c1102l == null) {
                            return;
                        }
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC16843l(c5008l, c15053l, string, c1102l, 3));
                        return;
                    case 6:
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC18388l(c5008l, new C15053l(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), AbstractC15323l.startapp(data.getBundle("data_root_hints"))));
                        return;
                    case 7:
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC9929l(c5008l, new C15053l(message.replyTo), z, 13));
                        return;
                    case 8:
                        Bundle bundleStartapp = AbstractC15323l.startapp(data.getBundle("data_search_extras"));
                        String string2 = data.getString("data_search_query");
                        C1102l c1102l2 = (C1102l) data.getParcelable("data_result_receiver");
                        C15053l c15053l2 = new C15053l(message.replyTo);
                        c5008l.getClass();
                        if (TextUtils.isEmpty(string2) || c1102l2 == null) {
                            return;
                        }
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC9984l(c5008l, c15053l2, string2, bundleStartapp, c1102l2, 0));
                        return;
                    case 9:
                        Bundle bundleStartapp2 = AbstractC15323l.startapp(data.getBundle("data_custom_action_extras"));
                        String string3 = data.getString("data_custom_action");
                        C1102l c1102l3 = (C1102l) data.getParcelable("data_result_receiver");
                        C15053l c15053l3 = new C15053l(message.replyTo);
                        c5008l.getClass();
                        if (TextUtils.isEmpty(string3) || c1102l3 == null) {
                            return;
                        }
                        ((ServiceC16415l) c5008l.f10245l).f32105l.amazon(new RunnableC9984l(c5008l, c15053l3, string3, bundleStartapp2, c1102l3, 1));
                        return;
                    default:
                        AbstractC6427l.vip("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 4:
                int i4 = message.what;
                int i5 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                SparseArray sparseArray = ((C1636l) this.loadAd).isPro;
                C7413l c7413l = (C7413l) sparseArray.get(i5);
                if (c7413l == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i5);
                if (i4 == 3) {
                    c7413l.loadAd((Bundle) obj);
                    return;
                } else {
                    if (i4 != 4) {
                        return;
                    }
                    C7413l.yandex(bundlePeekData != null ? bundlePeekData.getString("error") : null, (Bundle) obj);
                    return;
                }
            case 5:
                AbstractC3621l abstractC3621l = (AbstractC3621l) this.loadAd;
                int i6 = message.what;
                if (i6 != 1) {
                    if (i6 != 2) {
                        return;
                    }
                    abstractC3621l.f7560l = false;
                    abstractC3621l.purchase(abstractC3621l.f7558l);
                    return;
                }
                abstractC3621l.f7555l = false;
                C14965l c14965l = abstractC3621l.f7559l;
                if (c14965l != null) {
                    C4300l c4300l = abstractC3621l.f7554l;
                    C17646l c17646l = (C17646l) c14965l.f29441l;
                    C12545l c12545lAmazon = c17646l.amazon(abstractC3621l);
                    if (c12545lAmazon != null) {
                        c17646l.vip(c12545lAmazon, c4300l);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                crashlytics(message);
                return;
            case 7:
                loadAd(message);
                return;
            default:
                C6499l c6499l = (C6499l) message.obj;
                C12014l c12014l = (C12014l) this.loadAd;
                if (c12014l.m3307strictfp(c6499l)) {
                    InterfaceC3270l interfaceC3270l = c6499l.amazon;
                    interfaceC3270l.getClass();
                    interfaceC3270l.yandex();
                    c12014l.m3308switch(c6499l);
                    return;
                }
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.yandex) {
            case 3:
                Bundle data = message.getData();
                ClassLoader classLoader = C5138l.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC8616l(Object obj, Looper looper, int i) {
        super(looper);
        this.yandex = i;
        this.loadAd = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC8616l(Looper looper) {
        super(looper);
        this.yandex = 3;
    }

    public HandlerC8616l(AbstractC3621l abstractC3621l) {
        this.yandex = 5;
        this.loadAd = abstractC3621l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8616l(Looper looper, C12014l c12014l) {
        super(looper);
        this.yandex = 8;
        this.loadAd = c12014l;
    }
}
