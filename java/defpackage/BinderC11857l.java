package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lِٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC11857l extends Binder implements InterfaceC1087l {
    public int billing;
    public final WeakReference purchase;

    public BinderC11857l(C13208l c13208l) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.purchase = new WeakReference(c13208l);
        this.billing = -1;
    }

    public static InterfaceC1087l crashlytics(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1087l)) {
            return (InterfaceC1087l) iInterfaceQueryLocalInterface;
        }
        C18555l c18555l = new C18555l();
        c18555l.purchase = iBinder;
        return c18555l;
    }

    @Override // defpackage.InterfaceC1087l
    public final void admob(int i, int i2, int i3) {
        isPro(new C12153l(i2, i3, 2));
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: class */
    public final void mo806class(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC6427l.vip("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            AbstractC12900l.subscription("onChildrenChanged(): Ignoring negative itemCount: ", i2, "MediaControllerStub");
            return;
        }
        if (bundle != null) {
            try {
                C17425l.yandex(bundle);
            } catch (RuntimeException e) {
                AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        isPro(new C4875l(22));
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: continue */
    public final void mo807continue(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.billing) == -1) {
            return;
        }
        try {
            isPro(new C6536l(13, C9009l.loadAd(i2, bundle)));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.InterfaceC1087l
    public final void firebase(int i, List list) {
        if (list == null || this.billing == -1) {
            return;
        }
        try {
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                c16971lMetrica.crashlytics(C14869l.subs(this.billing, bundle));
            }
            isPro(new C8677l(i, c16971lMetrica.mopub(), 4));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    public final void isPro(InterfaceC12052l interfaceC12052l) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C13208l c13208l = (C13208l) this.purchase.get();
            if (c13208l == null) {
                return;
            }
            AbstractC15323l.m3966final(c13208l.yandex.f32839l, new RunnableC12388l(c13208l, interfaceC12052l, 9));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC1087l
    public final void loadAd(int i) {
        isPro(new C4875l(20));
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo808l(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC6427l.vip("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            AbstractC12900l.subscription("onSearchResultChanged(): Ignoring negative itemCount: ", i2, "MediaControllerStub");
            return;
        }
        if (bundle != null) {
            try {
                C17425l.yandex(bundle);
            } catch (RuntimeException e) {
                AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        isPro(new C4875l(22));
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: lؓۤٚ */
    public final void mo809l(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m3253l(i, C5159l.yandex(bundle));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final void mo810l(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(C3508l.amazon, z);
        bundle2.putBoolean(C3508l.purchase, true);
        mo811new(i, bundle, bundle2);
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void m3253l(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C13208l c13208l = (C13208l) this.purchase.get();
            if (c13208l == null) {
                return;
            }
            c13208l.loadAd.firebase(i, obj);
            c13208l.yandex.m4197abstract(new RunnableC9534l(c13208l, i, 7));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: new */
    public final void mo811new(int i, Bundle bundle, Bundle bundle2) {
        int i2;
        if (bundle == null || bundle2 == null || (i2 = this.billing) == -1) {
            return;
        }
        try {
            try {
                isPro(new C5131l(C1908l.ads(i2, bundle), new C3508l(bundle2.getBoolean(C3508l.amazon, false), bundle2.getBoolean(C3508l.purchase, false)), 27));
            } catch (RuntimeException e) {
                AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            mo806class(parcel.readInt(), parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        if (i == 4002) {
            mo808l(parcel.readInt(), parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        switch (i) {
            case 3001:
                mo815throws(parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3002:
                mo809l(parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3003:
                mo813this(parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3004:
                firebase(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3005:
                int i3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                mo812static(i3, (Bundle) AbstractC9592l.yandex(parcel, creator), (Bundle) AbstractC9592l.yandex(parcel, creator));
                return true;
            case 3006:
                parcel.readInt();
                yandex();
                return true;
            case 3007:
                mo810l(parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3008:
                mo807continue(parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3009:
                mo814throw(parcel.readInt(), (Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR));
                return true;
            case 3010:
                parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle = (Bundle) AbstractC9592l.yandex(parcel, creator2);
                Bundle bundle2 = (Bundle) AbstractC9592l.yandex(parcel, creator2);
                if (bundle != null && bundle2 != null) {
                    try {
                        try {
                            isPro(new C5131l(C14023l.loadAd(bundle), C16616l.loadAd(bundle2), 28));
                        } catch (RuntimeException e) {
                            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
                        }
                    } catch (RuntimeException e2) {
                        AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e2);
                    }
                }
                return true;
            case 3011:
                loadAd(parcel.readInt());
                return true;
            case 3012:
                parcel.readInt();
                Bundle bundleStartapp = AbstractC15323l.startapp((Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR));
                if (bundleStartapp == null) {
                    AbstractC6427l.vip("MediaControllerStub", "Ignoring null Bundle for extras");
                    return true;
                }
                isPro(new C6536l(15, bundleStartapp));
                return true;
            case 3013:
                int i4 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo811new(i4, (Bundle) AbstractC9592l.yandex(parcel, creator3), (Bundle) AbstractC9592l.yandex(parcel, creator3));
                return true;
            case 3014:
                isPro(new C6536l(parcel.readInt(), (PendingIntent) AbstractC9592l.yandex(parcel, PendingIntent.CREATOR)));
                return true;
            case 3015:
                try {
                    isPro(new C4875l(parcel.readInt(), C18503l.yandex((Bundle) AbstractC9592l.yandex(parcel, Bundle.CREATOR))));
                } catch (RuntimeException e3) {
                    AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e3);
                }
                return true;
            case 3016:
                int i5 = parcel.readInt();
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                if (arrayListCreateTypedArrayList != null && this.billing != -1) {
                    try {
                        C16971l c16971lMetrica = AbstractC1186l.metrica();
                        for (int i6 = 0; i6 < arrayListCreateTypedArrayList.size(); i6++) {
                            Bundle bundle3 = (Bundle) arrayListCreateTypedArrayList.get(i6);
                            bundle3.getClass();
                            c16971lMetrica.crashlytics(C14869l.subs(this.billing, bundle3));
                        }
                        isPro(new C8677l(i5, c16971lMetrica.mopub(), 3));
                    } catch (RuntimeException e4) {
                        AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e4);
                    }
                }
                return true;
            case 3017:
                int i7 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) AbstractC9592l.yandex(parcel, creator4);
                Bundle bundle5 = (Bundle) AbstractC9592l.yandex(parcel, creator4);
                Bundle bundle6 = (Bundle) AbstractC9592l.yandex(parcel, creator4);
                if (bundle4 == null || bundle5 == null) {
                    AbstractC6427l.vip("MediaControllerStub", "Ignoring custom command progress update with null args.");
                } else {
                    try {
                        isPro(new C10503l(i7, C12417l.yandex(bundle4), bundle5, bundle6));
                    } catch (RuntimeException e5) {
                        AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e5);
                    }
                }
                return true;
            case 3018:
                admob(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: static */
    public final void mo812static(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            AbstractC6427l.vip("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            isPro(new C0743l(i, C12417l.yandex(bundle), bundle2));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: this */
    public final void mo813this(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.billing) == -1) {
            return;
        }
        try {
            m3253l(i, C9201l.yandex(i2, bundle));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: throw */
    public final void mo814throw(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            isPro(new C16487l(C16616l.loadAd(bundle)));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.InterfaceC1087l
    /* JADX INFO: renamed from: throws */
    public final void mo815throws(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            C5728l c5728lYandex = C5728l.yandex(bundle);
            this.billing = c5728lYandex.loadAd;
            isPro(new C6536l(12, c5728lYandex));
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            yandex();
        }
    }

    @Override // defpackage.InterfaceC1087l
    public final void yandex() {
        isPro(new C4875l(21));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
