package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lَٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16308l implements InterfaceC3634l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2673l f31895l = AbstractC14904l.smaato("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f31896l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C16496l f31897l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f31898l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f31899l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C14605l f31900l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Context f31901l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C17781l f31902l;

    public C16308l(Context context, C14605l c14605l, C17781l c17781l) {
        this.f31901l = context;
        this.f31900l = c14605l;
        this.f31902l = c17781l;
    }

    public final C16496l loadAd(InterfaceC14257l interfaceC14257l, String str, String str2) {
        InterfaceC11594l c17161l;
        Context context = this.f31901l;
        IBinder iBinderLoadAd = C7269l.crashlytics(context, interfaceC14257l, str).loadAd(str2);
        int i = AbstractBinderC10197l.billing;
        C16496l c16496l = null;
        if (iBinderLoadAd == null) {
            c17161l = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderLoadAd.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            c17161l = iInterfaceQueryLocalInterface instanceof InterfaceC11594l ? (InterfaceC11594l) iInterfaceQueryLocalInterface : new C17161l(iBinderLoadAd, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 3);
        }
        BinderC14844l binderC14844l = new BinderC14844l(context);
        int i2 = this.f31900l.yandex;
        C17161l c17161l2 = (C17161l) c17161l;
        Parcel parcelM743l = c17161l2.m743l();
        int i3 = AbstractC12306l.yandex;
        parcelM743l.writeStrongBinder(binderC14844l);
        parcelM743l.writeInt(1);
        int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
        AbstractC9968l.subscription(parcelM743l, 1, 4);
        parcelM743l.writeInt(i2);
        AbstractC9968l.subscription(parcelM743l, 2, 4);
        parcelM743l.writeInt(0);
        AbstractC9968l.Signature(parcelM743l, iTapsense);
        Parcel parcelM746l = c17161l2.m746l(parcelM743l, 1);
        IBinder strongBinder = parcelM746l.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            c16496l = iInterfaceQueryLocalInterface2 instanceof C16496l ? (C16496l) iInterfaceQueryLocalInterface2 : new C16496l(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 3);
        }
        parcelM746l.recycle();
        return c16496l;
    }

    @Override // defpackage.InterfaceC3634l
    public final boolean mopub() throws C12397l {
        if (this.f31897l != null) {
            return this.f31898l;
        }
        Context context = this.f31901l;
        int iYandex = C7269l.yandex(context, ModuleDescriptor.MODULE_ID);
        C17781l c17781l = this.f31902l;
        if (iYandex > 0) {
            this.f31898l = true;
            try {
                this.f31897l = loadAd(C7269l.crashlytics, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new C12397l("Failed to create thick barcode scanner.", e);
            } catch (C2315l e2) {
                throw new C12397l("Failed to load the bundled barcode module.", e2);
            }
        } else {
            boolean z = false;
            this.f31898l = false;
            C9138l[] c9138lArr = AbstractC11698l.yandex;
            C13268l.loadAd.getClass();
            int iYandex2 = C13268l.yandex(context);
            C2673l c2673l = f31895l;
            if (iYandex2 >= 221500000) {
                try {
                    C3823l c3823lBilling = new C7560l(context, C7560l.remoteconfig, InterfaceC13945l.yandex, C1308l.crashlytics).billing(new C13060l(AbstractC11698l.loadAd(AbstractC11698l.amazon, c2673l), 1));
                    C9912l c9912l = new C9912l(25);
                    c3823lBilling.getClass();
                    c3823lBilling.amazon(AbstractC8333l.yandex, c9912l);
                    z = ((C5156l) AbstractC4311l.crashlytics(c3823lBilling)).f11204l;
                } catch (InterruptedException | ExecutionException e3) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
                }
            } else {
                try {
                    C0507l c0507lRemoteconfig = c2673l.listIterator(0);
                    while (c0507lRemoteconfig.hasNext()) {
                        C7269l.crashlytics(context, C7269l.loadAd, (String) c0507lRemoteconfig.next());
                    }
                    z = true;
                } catch (C2315l unused) {
                }
            }
            if (!z) {
                if (!this.f31896l) {
                    AbstractC11698l.yandex(context, AbstractC14904l.smaato("barcode", "tflite_dynamite"));
                    this.f31896l = true;
                }
                AbstractC14693l.loadAd(c17781l, EnumC5421l.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C12397l("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f31897l = loadAd(C7269l.loadAd, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | C2315l e4) {
                AbstractC14693l.loadAd(c17781l, EnumC5421l.OPTIONAL_MODULE_INIT_ERROR);
                throw new C12397l("Failed to create thin barcode scanner.", e4);
            }
        }
        AbstractC14693l.loadAd(c17781l, EnumC5421l.NO_ERROR);
        return this.f31898l;
    }

    @Override // defpackage.InterfaceC3634l
    public final ArrayList yandex(C3049l c3049l) throws C12397l {
        BinderC14844l binderC14844l;
        if (this.f31897l == null) {
            mopub();
        }
        C16496l c16496l = this.f31897l;
        AbstractC1051l.subs(c16496l);
        if (!this.f31899l) {
            try {
                c16496l.m741l(c16496l.m743l(), 1);
                this.f31899l = true;
            } catch (RemoteException e) {
                throw new C12397l("Failed to init barcode scanner.", e);
            }
        }
        int rowStride = c3049l.crashlytics;
        if (c3049l.billing == 35) {
            Image.Plane[] planeArrYandex = c3049l.yandex();
            AbstractC1051l.subs(planeArrYandex);
            rowStride = planeArrYandex[0].getRowStride();
        }
        int i = c3049l.billing;
        int i2 = c3049l.amazon;
        int iYandex = AbstractC16422l.yandex(c3049l.purchase);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = c3049l.billing;
        if (i3 != -1) {
            if (i3 != 17) {
                if (i3 == 35) {
                    binderC14844l = new BinderC14844l(c3049l.loadAd != null ? (Image) c3049l.loadAd.f29576l : null);
                } else if (i3 != 842094169) {
                    throw new C12397l(AbstractC0653l.vip(c3049l.billing, "Unsupported image format: "), 3);
                }
            }
            AbstractC1051l.subs(null);
            throw null;
        }
        Bitmap bitmap = c3049l.yandex;
        AbstractC1051l.subs(bitmap);
        binderC14844l = new BinderC14844l(bitmap);
        try {
            Parcel parcelM743l = c16496l.m743l();
            int i4 = AbstractC12306l.yandex;
            parcelM743l.writeStrongBinder(binderC14844l);
            parcelM743l.writeInt(1);
            int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
            AbstractC9968l.subscription(parcelM743l, 1, 4);
            parcelM743l.writeInt(i);
            AbstractC9968l.subscription(parcelM743l, 2, 4);
            parcelM743l.writeInt(rowStride);
            AbstractC9968l.subscription(parcelM743l, 3, 4);
            parcelM743l.writeInt(i2);
            AbstractC9968l.subscription(parcelM743l, 4, 4);
            parcelM743l.writeInt(iYandex);
            AbstractC9968l.subscription(parcelM743l, 5, 8);
            parcelM743l.writeLong(jElapsedRealtime);
            AbstractC9968l.Signature(parcelM743l, iTapsense);
            Parcel parcelM746l = c16496l.m746l(parcelM743l, 3);
            ArrayList arrayListCreateTypedArrayList = parcelM746l.createTypedArrayList(C3212l.CREATOR);
            parcelM746l.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C8130l(new C18675l((C3212l) it.next()), c3049l.mopub));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new C12397l("Failed to run barcode scanner.", e2);
        }
    }

    @Override // defpackage.InterfaceC3634l
    public final void zzb() {
        C16496l c16496l = this.f31897l;
        if (c16496l != null) {
            try {
                c16496l.m741l(c16496l.m743l(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.f31897l = null;
            this.f31899l = false;
        }
    }
}
