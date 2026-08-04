package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٌَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8662l {
    public Object amazon;
    public boolean crashlytics;
    public int loadAd;
    public Object purchase;
    public final /* synthetic */ int yandex;

    public C8662l(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.yandex = 5;
        this.amazon = jArr;
        this.purchase = remoteViewsArr;
        this.crashlytics = false;
        this.loadAd = 1;
        if (jArr.length != remoteViewsArr.length) {
            C8339l.metrica("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC16901l.m4245throws(arrayList).size();
        if (size <= 1) {
            return;
        }
        C10754l.metrica(AbstractC15560l.tapsense("View type count is set to 1, but the collection contains ", size, " different layout ids"));
        throw null;
    }

    public static C8662l amazon(FileChannel fileChannel) throws C13768l, IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        int i = fileChannel.read(byteBufferAllocate);
        if (i < 4) {
            C18262l.metrica(AbstractC15560l.tapsense("Unable to read required number of databytes read:", i, ":required:4"));
            return null;
        }
        byteBufferAllocate.rewind();
        C8662l c8662l = new C8662l();
        c8662l.crashlytics = ((byteBufferAllocate.get(0) & 128) >>> 7) == 1;
        int i2 = byteBufferAllocate.get(0) & 127;
        if (i2 >= EnumC2692l.values().length) {
            throw new C13768l("Flac file has invalid block type %s", Integer.valueOf(i2));
        }
        c8662l.purchase = EnumC2692l.values()[i2];
        c8662l.loadAd = ((byteBufferAllocate.get(1) & 255) << 16) + ((byteBufferAllocate.get(2) & 255) << 8) + (byteBufferAllocate.get(3) & 255);
        c8662l.amazon = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            ((byte[]) c8662l.amazon)[i3] = byteBufferAllocate.get(i3);
        }
        return c8662l;
    }

    public static C10147l yandex() {
        C10147l c10147l = new C10147l();
        c10147l.loadAd = false;
        c10147l.crashlytics = false;
        c10147l.purchase = 0;
        return c10147l;
    }

    public byte[] crashlytics() {
        byte[] bArr = (byte[]) this.amazon;
        bArr[0] = (byte) (bArr[0] & 127);
        return bArr;
    }

    public void loadAd(int i) {
        switch (this.yandex) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.purchase;
                WeakReference weakReference = bottomSheetBehavior.f632class;
                if (weakReference != null && weakReference.get() != null) {
                    this.loadAd = i;
                    if (!this.crashlytics) {
                        View view = (View) bottomSheetBehavior.f632class.get();
                        RunnableC5360l runnableC5360l = (RunnableC5360l) this.amazon;
                        WeakHashMap weakHashMap = AbstractC15872l.yandex;
                        view.postOnAnimation(runnableC5360l);
                        this.crashlytics = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.purchase;
                WeakReference weakReference2 = sideSheetBehavior.startapp;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.loadAd = i;
                    if (!this.crashlytics) {
                        View view2 = (View) sideSheetBehavior.startapp.get();
                        RunnableC6665l runnableC6665l = (RunnableC6665l) this.amazon;
                        WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                        view2.postOnAnimation(runnableC6665l);
                        this.crashlytics = true;
                    }
                    break;
                }
                break;
        }
    }

    public List purchase(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMetrica = ((C15053l) this.purchase).metrica(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C17391l c17391l = (C17391l) itMetrica;
            if (!c17391l.hasNext()) {
                return DesugarCollections.unmodifiableList(arrayList);
            }
            arrayList.add((String) c17391l.next());
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 4:
                return "BlockType:" + ((EnumC2692l) this.purchase) + " DataLength:" + this.loadAd + " isLastBlock:" + this.crashlytics;
            default:
                return super.toString();
        }
    }

    public C8662l(C10147l c10147l, C9138l[] c9138lArr, boolean z, int i) {
        this.yandex = 8;
        this.purchase = c10147l;
        this.amazon = c9138lArr;
        boolean z2 = false;
        if (c9138lArr != null && z) {
            z2 = true;
        }
        this.crashlytics = z2;
        this.loadAd = i;
    }

    public C8662l(boolean z, EnumC2692l enumC2692l, int i) {
        this.yandex = 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        this.purchase = enumC2692l;
        this.crashlytics = z;
        this.loadAd = i;
        int i2 = enumC2692l.f5825l;
        byteBufferAllocate.put(z ? (byte) (i2 | 128) : (byte) i2);
        byteBufferAllocate.put((byte) ((16711680 & i) >>> 16));
        byteBufferAllocate.put((byte) ((65280 & i) >>> 8));
        byteBufferAllocate.put((byte) (i & 255));
        this.amazon = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            ((byte[]) this.amazon)[i3] = byteBufferAllocate.get(i3);
        }
    }

    public /* synthetic */ C8662l() {
        this.yandex = 4;
    }

    public C8662l(C15053l c15053l, boolean z, AbstractC8791l abstractC8791l, int i) {
        this.yandex = 7;
        this.purchase = c15053l;
        this.crashlytics = z;
        this.amazon = abstractC8791l;
        this.loadAd = i;
    }

    public C8662l(Parcel parcel) {
        this.yandex = 5;
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.amazon = jArr;
        parcel.readLongArray(jArr);
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, RemoteViews.CREATOR);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                C11983l.purchase(46, remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.purchase = remoteViewsArr;
        this.crashlytics = parcel.readInt() == 1;
        this.loadAd = parcel.readInt();
    }

    public C8662l(Context context) {
        this.yandex = 1;
        this.amazon = context;
        this.purchase = new C18262l(7);
        InterfaceC11766l interfaceC11766l = C4264l.admob;
        this.loadAd = R.string.default_notification_channel_name;
    }

    public C8662l(SideSheetBehavior sideSheetBehavior) {
        this.yandex = 6;
        this.purchase = sideSheetBehavior;
        this.amazon = new RunnableC6665l(3, this);
    }

    public C8662l(BottomSheetBehavior bottomSheetBehavior) {
        this.yandex = 0;
        this.purchase = bottomSheetBehavior;
        this.amazon = new RunnableC5360l(2, this);
    }

    public C8662l(boolean z, int i, String str, Bundle bundle) {
        this.yandex = 3;
        this.crashlytics = z;
        this.loadAd = i;
        this.amazon = str;
        this.purchase = bundle == null ? Bundle.EMPTY : bundle;
    }

    public C8662l(Context context, C13488l c13488l) {
        this.yandex = 2;
        this.amazon = c13488l;
        this.loadAd = 0;
        this.purchase = new GestureDetector(context, new GestureDetectorOnGestureListenerC15964l(this));
    }
}
