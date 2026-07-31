package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.loadAd;
import android.support.v4.media.session.yandex;
import android.util.Log;
import android.view.KeyEvent;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: renamed from: lؙٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16227l extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16227l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        MediaBrowser mediaBrowser;
        InterfaceC4716l interfaceC4716l;
        InterfaceC4716l interfaceC4716l2;
        InterfaceC10867l interfaceC10867l;
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1424l c1424l = (C1424l) obj;
                C10100l c10100l = (C10100l) c1424l.f3602l;
                if (c10100l != null) {
                    HandlerC0341l handlerC0341l = c10100l.amazon;
                    MediaBrowser mediaBrowser2 = c10100l.loadAd;
                    try {
                        Bundle extras = mediaBrowser2.getExtras();
                        if (extras != null) {
                            boolean z = false;
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                Bundle bundle = c10100l.crashlytics;
                                mediaBrowser = mediaBrowser2;
                                C13645l c13645l = new C13645l(1, z);
                                c13645l.f26671l = new Messenger(binder);
                                c13645l.f26670l = bundle;
                                c10100l.billing = c13645l;
                                Messenger messenger = new Messenger(handlerC0341l);
                                c10100l.mopub = messenger;
                                handlerC0341l.getClass();
                                handlerC0341l.crashlytics = new WeakReference(messenger);
                                try {
                                    C13645l c13645l2 = c10100l.billing;
                                    Context context = c10100l.yandex;
                                    Messenger messenger2 = c10100l.mopub;
                                    c13645l2.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("data_package_name", context.getPackageName());
                                    bundle2.putInt("data_calling_pid", Process.myPid());
                                    bundle2.putBundle("data_root_hints", (Bundle) c13645l2.f26670l);
                                    Message messageObtain = Message.obtain();
                                    messageObtain.what = 6;
                                    messageObtain.arg1 = 1;
                                    messageObtain.setData(bundle2);
                                    messageObtain.replyTo = messenger2;
                                    ((Messenger) c13645l2.f26671l).send(messageObtain);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            } else {
                                mediaBrowser = mediaBrowser2;
                            }
                            IBinder binder2 = extras.getBinder("extra_session_binder");
                            int i2 = loadAd.billing;
                            if (binder2 == null) {
                                interfaceC4716l2 = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4716l)) {
                                    C6772l c6772l = new C6772l();
                                    c6772l.purchase = binder2;
                                    interfaceC4716l2 = c6772l;
                                } else {
                                    interfaceC4716l = (InterfaceC4716l) iInterfaceQueryLocalInterface;
                                }
                            }
                            if (interfaceC4716l2 != null) {
                                interfaceC4716l2 = interfaceC4716l;
                                MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                                c10100l.admob = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, interfaceC4716l2) : null;
                            }
                        }
                    } catch (IllegalStateException e) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                interfaceC4716l2 = interfaceC4716l;
                Context context2 = (Context) c1424l.f3601l;
                C10100l c10100l2 = ((C2987l) c1424l.f3606l).yandex;
                if (c10100l2.admob == null) {
                    MediaSession.Token sessionToken2 = c10100l2.loadAd.getSessionToken();
                    c10100l2.admob = sessionToken2 != null ? new MediaSessionCompat$Token(sessionToken2, null) : null;
                }
                MediaSessionCompat$Token mediaSessionCompat$Token = c10100l2.admob;
                if (mediaSessionCompat$Token == null) {
                    C8339l.metrica("sessionToken must not be null");
                } else {
                    DesugarCollections.synchronizedSet(new HashSet());
                    yandex c10212l = Build.VERSION.SDK_INT >= 29 ? new C10212l(context2, mediaSessionCompat$Token) : new yandex(context2, mediaSessionCompat$Token);
                    KeyEvent keyEvent = (KeyEvent) ((Intent) c1424l.f3605l).getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent == null) {
                        C8339l.metrica("KeyEvent may not be null");
                    } else {
                        c10212l.yandex.dispatchMediaButtonEvent(keyEvent);
                        c1424l.m911goto();
                    }
                }
                break;
            default:
                C18449l c18449l = (C18449l) obj;
                C9557l c9557l = (C9557l) c18449l.f36009l;
                if (c9557l != null) {
                    HandlerC0341l handlerC0341l2 = c9557l.amazon;
                    MediaBrowser mediaBrowser3 = c9557l.loadAd;
                    try {
                        Bundle bundleStartapp = AbstractC15323l.startapp(mediaBrowser3.getExtras());
                        if (bundleStartapp != null) {
                            bundleStartapp.getInt("extra_service_version", 0);
                            IBinder binder3 = bundleStartapp.getBinder("extra_messenger");
                            if (binder3 != null) {
                                C13568l c13568l = new C13568l(binder3, c9557l.crashlytics);
                                c9557l.billing = c13568l;
                                Messenger messenger3 = new Messenger(handlerC0341l2);
                                c9557l.mopub = messenger3;
                                handlerC0341l2.getClass();
                                handlerC0341l2.crashlytics = new WeakReference(messenger3);
                                try {
                                    Context context3 = c9557l.yandex;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("data_package_name", context3.getPackageName());
                                    bundle3.putInt("data_calling_pid", Process.myPid());
                                    bundle3.putBundle("data_root_hints", (Bundle) c13568l.f26580l);
                                    c13568l.subscription(6, bundle3, messenger3);
                                } catch (RemoteException unused2) {
                                    AbstractC6427l.firebase("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            IBinder binder4 = bundleStartapp.getBinder("extra_session_binder");
                            int i3 = BinderC2430l.billing;
                            if (binder4 == null) {
                                interfaceC10867l = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface2 = binder4.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC10867l)) {
                                    C10979l c10979l = new C10979l();
                                    c10979l.purchase = binder4;
                                    interfaceC10867l = c10979l;
                                } else {
                                    interfaceC10867l = (InterfaceC10867l) iInterfaceQueryLocalInterface2;
                                }
                            }
                            if (interfaceC10867l != null) {
                                c9557l.admob = new C5057l(mediaBrowser3.getSessionToken(), interfaceC10867l);
                            }
                        }
                    } catch (IllegalStateException e2) {
                        AbstractC6427l.subs("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
                    }
                }
                C0188l c0188l = (C0188l) c18449l.f36012l;
                C5138l c5138l = c0188l.isPro;
                if (c5138l != null) {
                    C9557l c9557l2 = (C9557l) c5138l.f11181l;
                    if (c9557l2.admob == null) {
                        c9557l2.admob = new C5057l(c9557l2.loadAd.getSessionToken(), null);
                    }
                    C5057l c5057l = c9557l2.admob;
                    C16811l c16811l = c0188l.loadAd;
                    c16811l.m4197abstract(new RunnableC12388l(c0188l, c5057l, 7));
                    c16811l.f32839l.postDelayed(new RunnableC10663l(c0188l, 0), 500L);
                }
                break;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C1424l) obj).m911goto();
                break;
            default:
                ((C0188l) ((C18449l) obj).f36012l).loadAd.release();
                break;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C1424l c1424l = (C1424l) obj;
                C10100l c10100l = (C10100l) c1424l.f3602l;
                if (c10100l != null) {
                    c10100l.billing = null;
                    c10100l.mopub = null;
                    c10100l.admob = null;
                    HandlerC0341l handlerC0341l = c10100l.amazon;
                    handlerC0341l.getClass();
                    handlerC0341l.crashlytics = new WeakReference(null);
                }
                c1424l.m911goto();
                break;
            default:
                C18449l c18449l = (C18449l) obj;
                C9557l c9557l = (C9557l) c18449l.f36009l;
                if (c9557l != null) {
                    c9557l.billing = null;
                    c9557l.mopub = null;
                    c9557l.admob = null;
                    HandlerC0341l handlerC0341l2 = c9557l.amazon;
                    handlerC0341l2.getClass();
                    handlerC0341l2.crashlytics = new WeakReference(null);
                }
                ((C0188l) c18449l.f36012l).loadAd.release();
                break;
        }
    }
}
