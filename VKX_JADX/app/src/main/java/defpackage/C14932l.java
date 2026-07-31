package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؚٔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C14932l extends MediaBrowserService {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C12014l f29385l;

    public C14932l(C12014l c12014l, Context context) {
        this.f29385l = c12014l;
        attachBaseContext(context);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        C2494l c2494l;
        C2494l c2494l2;
        C2494l c2494l3;
        C6499l c6499lLoadAd;
        C9201l c9201l;
        Bundle bundle3;
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
        C12014l c12014l = this.f29385l;
        ServiceC16415l serviceC16415l = (ServiceC16415l) c12014l.f23943l;
        Bundle bundle4 = bundleStartapp == null ? null : new Bundle(bundleStartapp);
        int i2 = -1;
        if (bundle4 == null || bundle4.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle4.remove("extra_client_version");
            c12014l.f23944l = new Messenger(serviceC16415l.f32105l);
            Bundle bundle5 = new Bundle();
            bundle5.putInt("extra_service_version", 2);
            bundle5.putBinder("extra_messenger", ((Messenger) c12014l.f23944l).getBinder());
            C5057l c5057l = serviceC16415l.f32106l;
            if (c5057l != null) {
                InterfaceC10867l interfaceC10867lYandex = c5057l.yandex();
                bundle5.putBinder("extra_session_binder", interfaceC10867lYandex == null ? null : interfaceC10867lYandex.asBinder());
            } else {
                ((ArrayList) c12014l.f23941l).add(bundle5);
            }
            i2 = bundle4.getInt("extra_calling_pid", -1);
            bundle4.remove("extra_calling_pid");
            bundle2 = bundle5;
        }
        C7996l c7996l = new C7996l(serviceC16415l, str, i2, i, null);
        serviceC16415l.f32114l = c7996l;
        C3726l c3726l = serviceC16415l.f32112l;
        C12014l c12014l2 = serviceC16415l.f32115l;
        C12014l c12014l3 = serviceC16415l.f32108l;
        c12014l3.getClass();
        C16701l c16701lPro = c12014l3.pro();
        Bundle bundle6 = bundle4 != null ? bundle4 : Bundle.EMPTY;
        boolean zSmaato = serviceC16415l.f32113l.smaato(c16701lPro);
        C17947l c17947l = new C17947l(serviceC16415l, c16701lPro);
        AbstractC8481l abstractC8481l = AbstractC18585l.yandex;
        Math.max(0, bundle6.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        C6499l c6499l = new C6499l(c16701lPro, 0, 0, zSmaato, c17947l, bundle6);
        AtomicReference atomicReference = new AtomicReference();
        C5811l c5811l = new C5811l();
        AbstractC15323l.m3966final(serviceC16415l.f32109l.smaato, new RunnableC4063l(serviceC16415l, atomicReference, c6499l, c5811l, 12));
        try {
            c5811l.yandex();
            C3764l c3764l = (C3764l) atomicReference.get();
            c3764l.getClass();
            c12014l2.mopub(c16701lPro, c6499l, c3764l.yandex, c3764l.loadAd);
            c2494l = AbstractC8672l.yandex;
        } catch (InterruptedException e) {
            AbstractC6427l.subs("MSSLegacyStub", "Couldn't get a result from onConnect", e);
            c2494l = null;
        }
        if (c2494l == null || (c6499lLoadAd = serviceC16415l.loadAd()) == null || !c12014l2.m3301extends(c6499lLoadAd, 50000)) {
            c2494l2 = null;
        } else {
            C17425l c17425lAdmob = AbstractC18585l.admob(c3726l.billing, bundle4);
            AtomicReference atomicReference2 = new AtomicReference();
            C5811l c5811l2 = new C5811l();
            AbstractC15323l.m3966final(c3726l.smaato, new RunnableC0295l(serviceC16415l, atomicReference2, c6499lLoadAd, c17425lAdmob, c5811l2, 4));
            try {
                c5811l2.yandex();
                c9201l = (C9201l) ((ListenableFuture) atomicReference2.get()).get();
                AbstractC12442l.metrica(c9201l, "LibraryResult must not be null");
            } catch (InterruptedException | CancellationException | ExecutionException e2) {
                AbstractC6427l.subs("MLSLegacyStub", "Couldn't get a result from onGetLibraryRoot", e2);
                c9201l = null;
            }
            if (c9201l != null) {
                Object obj = c9201l.crashlytics;
                if (c9201l.yandex == 0 && obj != null) {
                    C17425l c17425l = c9201l.purchase;
                    if (c17425l != null) {
                        Bundle bundle7 = c17425l.yandex;
                        bundle3 = new Bundle(bundle7);
                        if (bundle7.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY")) {
                            boolean z = bundle7.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
                            bundle3.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
                            bundle3.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z ? 1 : 3);
                        }
                        bundle3.putBoolean("android.service.media.extra.RECENT", c17425l.loadAd);
                        bundle3.putBoolean("android.service.media.extra.OFFLINE", c17425l.crashlytics);
                        bundle3.putBoolean("android.service.media.extra.SUGGESTED", c17425l.amazon);
                    } else {
                        bundle3 = new Bundle();
                    }
                    bundle3.putBoolean("android.media.browse.SEARCH_SUPPORTED", c12014l2.m3301extends(c6499lLoadAd, 50005));
                    AbstractC1186l abstractC1186l = c3726l.ads;
                    if (!abstractC1186l.isEmpty()) {
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (int i3 = 0; i3 < abstractC1186l.size(); i3++) {
                            C14869l c14869l = (C14869l) abstractC1186l.get(i3);
                            C12417l c12417l = c14869l.yandex;
                            if (c12417l != null && c12417l.yandex == 0) {
                                Bundle bundle8 = new Bundle();
                                C12417l c12417l2 = c14869l.yandex;
                                Bundle bundle9 = c14869l.mopub;
                                if (c12417l2 != null) {
                                    bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", c12417l2.loadAd);
                                }
                                bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL", c14869l.billing.toString());
                                Uri uri = c14869l.purchase;
                                if (uri != null) {
                                    bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI", uri.toString());
                                }
                                if (!bundle9.isEmpty()) {
                                    bundle8.putBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS", bundle9);
                                }
                                arrayList.add(bundle8);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            bundle3.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", arrayList);
                        }
                    }
                    c2494l2 = new C2494l(((C2427l) obj).yandex, bundle3);
                } else if (c9201l != null || c9201l.yandex == 0) {
                    c2494l2 = AbstractC8672l.yandex;
                } else {
                    c2494l2 = null;
                }
            } else {
                if (c9201l != null) {
                }
                c2494l2 = AbstractC8672l.yandex;
            }
        }
        serviceC16415l.f32114l = null;
        if (c2494l2 == null) {
            c2494l3 = null;
        } else {
            if (((Messenger) c12014l.f23944l) != null) {
                serviceC16415l.f32111l.add(c7996l);
            }
            Bundle bundle10 = (Bundle) c2494l2.f5290l;
            if (bundle2 == null) {
                bundle2 = bundle10;
            } else if (bundle10 != null) {
                bundle2.putAll(bundle10);
            }
            c2494l3 = new C2494l((String) c2494l2.f5291l, bundle2);
        }
        if (c2494l3 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) c2494l3.f5291l, (Bundle) c2494l3.f5290l);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        C9346l c9346l = new C9346l(str, new C5501l(16, result), 0);
        ServiceC16415l serviceC16415l = (ServiceC16415l) this.f29385l.f23943l;
        serviceC16415l.f32114l = serviceC16415l.f32104l;
        serviceC16415l.amazon(str, c9346l, null);
        serviceC16415l.f32114l = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C9346l c9346l = new C9346l(str, new C5501l(16, result), 1);
        ServiceC16415l serviceC16415l = (ServiceC16415l) this.f29385l.f23943l;
        serviceC16415l.f32114l = serviceC16415l.f32104l;
        serviceC16415l.purchase(str, c9346l);
        serviceC16415l.f32114l = null;
    }
}
