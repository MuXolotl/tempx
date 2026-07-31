package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: lًؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC7734l extends Handler {
    public final /* synthetic */ Object crashlytics;
    public boolean loadAd;
    public final /* synthetic */ int yandex = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7734l(C17977l c17977l, Looper looper) {
        super(looper);
        this.crashlytics = c17977l;
        this.loadAd = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objBilling;
        C13071l c13071l;
        int iMopub;
        boolean zMo1137l;
        switch (this.yandex) {
            case 0:
                C5226l c5226l = (C5226l) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        objBilling = ((C15034l) this.crashlytics).firebase.billing((C1441l) c5226l.amazon);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        C15034l c15034l = (C15034l) this.crashlytics;
                        C6150l c6150lPurchase = c15034l.firebase.purchase(c15034l.smaato, (C3584l) c5226l.amazon);
                        synchronized (((C15034l) this.crashlytics).metrica) {
                            try {
                                C16543l c16543l = ((C15034l) this.crashlytics).advert;
                                if (c16543l != null && (c13071l = c6150lPurchase.loadAd) != null) {
                                    ((C16971l) c16543l.f32482l).crashlytics(new C13071l(c13071l.yandex, c13071l.loadAd, c13071l.crashlytics, c13071l.amazon, SystemClock.elapsedRealtime() - c5226l.crashlytics, c13071l.billing));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        objBilling = c6150lPurchase;
                    }
                } catch (C3240l e) {
                    boolean zYandex = yandex(message, e);
                    objBilling = e;
                    if (zYandex) {
                        return;
                    }
                } catch (Exception e2) {
                    AbstractC6427l.metrica("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    objBilling = e2;
                }
                C14513l c14513l = ((C15034l) this.crashlytics).subs;
                long j = c5226l.yandex;
                c14513l.getClass();
                synchronized (this) {
                    try {
                        if (!this.loadAd) {
                            ((C15034l) this.crashlytics).vip.obtainMessage(message.what, Pair.create(c5226l.amazon, objBilling)).sendToTarget();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                C17977l c17977l = (C17977l) this.crashlytics;
                C0188l c0188l = c17977l.purchase;
                if (this.loadAd) {
                    int i2 = message.what;
                    if (i2 == 2) {
                        c17977l.loadAd((C16830l) message.obj);
                        return;
                    }
                    if (i2 == 8) {
                        c0188l.loadAd.release();
                        return;
                    }
                    if (i2 == 9) {
                        int iIntValue = ((Integer) message.obj).intValue();
                        C5908l c5908l = c0188l.vip;
                        c0188l.vip = new C5908l((C13052l) c5908l.f12452l, (C16830l) c5908l.f12458l, (C8937l) c5908l.f12457l, (List) c5908l.f12459l, (CharSequence) c5908l.f12453l, iIntValue, c5908l.f12455l, (Bundle) c5908l.f12454l);
                        c17977l.purchase();
                        return;
                    }
                    switch (i2) {
                        case 11:
                            c17977l.yandex(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            C5908l c5908l2 = c0188l.vip;
                            c0188l.vip = new C5908l((C13052l) c5908l2.f12452l, (C16830l) c5908l2.f12458l, (C8937l) c5908l2.f12457l, (List) c5908l2.f12459l, (CharSequence) c5908l2.f12453l, c5908l2.f12456l, iIntValue2, (Bundle) c5908l2.f12454l);
                            c17977l.purchase();
                            return;
                        case 13:
                            if (!c0188l.smaato) {
                                c0188l.m343l();
                                return;
                            }
                            C5908l c5908l3 = c0188l.vip;
                            C16830l c16830lM290l = C0188l.m290l(c0188l.subs.signatures());
                            InterfaceC10867l interfaceC10867lYandex = ((C10730l) c0188l.subs.f35934l).purchase.yandex();
                            int iMo1138l = -1;
                            if (interfaceC10867lYandex != null) {
                                try {
                                    iMopub = interfaceC10867lYandex.mopub();
                                } catch (RemoteException | SecurityException e3) {
                                    AbstractC6427l.subs("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
                                    iMopub = -1;
                                }
                            } else {
                                iMopub = -1;
                            }
                            InterfaceC10867l interfaceC10867lYandex2 = ((C10730l) c0188l.subs.f35934l).purchase.yandex();
                            if (interfaceC10867lYandex2 != null) {
                                try {
                                    iMo1138l = interfaceC10867lYandex2.mo1138l();
                                } catch (RemoteException | SecurityException e4) {
                                    AbstractC6427l.subs("MediaControllerCompat", "Dead object in getShuffleMode.", e4);
                                }
                                break;
                            }
                            c0188l.vip = new C5908l((C13052l) c5908l3.f12452l, c16830lM290l, (C8937l) c5908l3.f12457l, (List) c5908l3.f12459l, (CharSequence) c5908l3.f12453l, iMopub, iMo1138l, (Bundle) c5908l3.f12454l);
                            InterfaceC10867l interfaceC10867lYandex3 = ((C10730l) c0188l.subs.f35934l).purchase.yandex();
                            if (interfaceC10867lYandex3 != null) {
                                try {
                                    zMo1137l = interfaceC10867lYandex3.mo1137l();
                                } catch (RemoteException | SecurityException e5) {
                                    AbstractC6427l.subs("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e5);
                                    zMo1137l = false;
                                }
                                break;
                            } else {
                                zMo1137l = false;
                            }
                            c17977l.yandex(zMo1137l);
                            c17977l.amazon.removeMessages(1);
                            c0188l.m345l(false, c0188l.vip);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    public synchronized void loadAd() {
        removeCallbacksAndMessages(null);
        this.loadAd = true;
    }

    public boolean yandex(Message message, C3240l c3240l) {
        long jMin;
        C5226l c5226l = (C5226l) message.obj;
        if (c5226l.loadAd) {
            int i = c5226l.purchase + 1;
            c5226l.purchase = i;
            if (i <= ((C15034l) this.crashlytics).subs.license(3)) {
                C13071l c13071l = new C13071l(c3240l.f6932l, c3240l.f6931l, c3240l.f6930l, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c5226l.crashlytics, c3240l.f6933l);
                Throwable c8413l = c3240l.getCause() instanceof IOException ? (IOException) c3240l.getCause() : new C8413l(c3240l.getCause());
                C14513l c14513l = ((C15034l) this.crashlytics).subs;
                int i2 = c5226l.purchase;
                c14513l.getClass();
                while (true) {
                    if (c8413l == null) {
                        jMin = Math.min((i2 - 1) * 1000, 5000);
                        break;
                    }
                    if ((c8413l instanceof C17655l) || (c8413l instanceof FileNotFoundException) || (c8413l instanceof C7825l) || (c8413l instanceof C12971l) || ((c8413l instanceof C12126l) && ((C12126l) c8413l).f24145l == 2008)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    c8413l = c8413l.getCause();
                }
                if (jMin == -9223372036854775807L) {
                    return false;
                }
                synchronized (((C15034l) this.crashlytics).metrica) {
                    C16543l c16543l = ((C15034l) this.crashlytics).advert;
                    if (c16543l != null) {
                        ((C16971l) c16543l.f32482l).crashlytics(c13071l);
                    }
                }
                synchronized (this) {
                    try {
                        if (this.loadAd) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), jMin);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7734l(C15034l c15034l, Looper looper) {
        super(looper);
        this.crashlytics = c15034l;
    }
}
