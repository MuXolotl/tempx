package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5395l extends Binder implements IInterface {
    public final /* synthetic */ int purchase;

    public AbstractBinderC5395l(String str, int i) {
        this.purchase = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
            default:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.purchase;
        return this;
    }

    /* JADX INFO: renamed from: lٕؓۡ */
    public boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public abstract boolean mo1774l(int i, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: lّٔ٘ */
    public abstract boolean mo1423l(Parcel parcel, int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long jCrashlytics;
        String str;
        int i3 = 1;
        switch (this.purchase) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.ytkab0bp.vkmusic.IVKExternalMusic");
                }
                if (i == 1598968902) {
                    parcel2.writeString("ru.ytkab0bp.vkmusic.IVKExternalMusic");
                    return true;
                }
                int i4 = 0;
                ?? r1 = 0;
                switch (i) {
                    case 2:
                        ((BinderC3896l) this).billing.billing(parcel.readInt(), "other", parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        if (((BinderC3896l) this).billing.amazon.m1190l()) {
                            C16287l.yandex.getClass();
                            jCrashlytics = C16287l.crashlytics();
                        } else {
                            jCrashlytics = 0;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt((int) jCrashlytics);
                        return true;
                    case 4:
                        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                        BinderC3896l binderC3896l = (BinderC3896l) this;
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        if (VKXApplication.Companion.crashlytics()) {
                            C15478l c15478l = C15478l.purchase;
                            C5835l c5835l = binderC3896l.billing;
                            PackageManager packageManager = (PackageManager) c5835l.amazon.f5290l;
                            String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
                            String string = (packagesForUid == null || (str = packagesForUid[0]) == null) ? "" : packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
                            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListCreateStringArrayList, 10));
                            Iterator it = arrayListCreateStringArrayList.iterator();
                            while (it.hasNext()) {
                                arrayList.add((AudioTrack) c5835l.yandex.crashlytics((String) it.next()));
                            }
                            C5528l c5528l = new C5528l(String.valueOf(arrayList.hashCode()), string, arrayList);
                            c15478l.getClass();
                            C15478l.loadAd(null, c5528l);
                        } else {
                            VKXApplication vKXApplication = VKXApplication.f36631l;
                            Toast.makeText((Context) (vKXApplication != null ? vKXApplication : 0), "Нужно соединение с Интернетом!", 1).show();
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        ((BinderC3896l) this).billing.loadAd(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        C5835l c5835l2 = ((BinderC3896l) this).billing;
                        List<String> list = c5835l2.amazon.m1190l() ? (List) AbstractC10999l.subs(C17218l.f33421l, new C8345l(c5835l2, r1, i3)) : C2580l.f5619l;
                        parcel2.writeNoException();
                        parcel2.writeStringList(list);
                        return true;
                    case 7:
                        int i5 = parcel.readInt();
                        int i6 = parcel.readInt();
                        long j = i5;
                        C5835l c5835l3 = ((BinderC3896l) this).billing;
                        C2494l c2494l = c5835l3.amazon;
                        C17119l c17119l = new C17119l(c5835l3, i6, j);
                        if (c2494l.m1190l()) {
                            c17119l.invoke();
                        }
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        int i7 = parcel.readInt();
                        int i8 = parcel.readInt();
                        long j2 = i7;
                        if (((BinderC3896l) this).billing.amazon.m1190l()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(j2);
                            sb.append('_');
                            sb.append(i8);
                            String string2 = sb.toString();
                            C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                            if ((c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string2}, 1))) : null) != null) {
                                i4 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i4);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo1774l(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo1129l(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo1129l(i, parcel, parcel2);
            case 4:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo1423l(parcel, i);
        }
    }
}
