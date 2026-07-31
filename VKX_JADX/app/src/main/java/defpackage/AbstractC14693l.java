package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٔؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14693l {
    public static final HashMap amazon;
    public static final AtomicReference crashlytics;
    public static final SparseArray loadAd;
    public static final SparseArray yandex;

    static {
        SparseArray sparseArray = new SparseArray();
        yandex = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        loadAd = sparseArray2;
        crashlytics = new AtomicReference();
        sparseArray.put(-1, EnumC12536l.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC12536l.FORMAT_CODE_128);
        sparseArray.put(2, EnumC12536l.FORMAT_CODE_39);
        sparseArray.put(4, EnumC12536l.FORMAT_CODE_93);
        sparseArray.put(8, EnumC12536l.FORMAT_CODABAR);
        sparseArray.put(16, EnumC12536l.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC12536l.FORMAT_EAN_13);
        sparseArray.put(64, EnumC12536l.FORMAT_EAN_8);
        sparseArray.put(128, EnumC12536l.FORMAT_ITF);
        sparseArray.put(PSKKeyManager.MAX_KEY_LENGTH_BYTES, EnumC12536l.FORMAT_QR_CODE);
        sparseArray.put(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, EnumC12536l.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC12536l.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC12536l.FORMAT_PDF417);
        sparseArray.put(4096, EnumC12536l.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC6850l.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC6850l.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC6850l.TYPE_EMAIL);
        sparseArray2.put(3, EnumC6850l.TYPE_ISBN);
        sparseArray2.put(4, EnumC6850l.TYPE_PHONE);
        sparseArray2.put(5, EnumC6850l.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC6850l.TYPE_SMS);
        sparseArray2.put(7, EnumC6850l.TYPE_TEXT);
        sparseArray2.put(8, EnumC6850l.TYPE_URL);
        sparseArray2.put(9, EnumC6850l.TYPE_WIFI);
        sparseArray2.put(10, EnumC6850l.TYPE_GEO);
        sparseArray2.put(11, EnumC6850l.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC6850l.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        amazon = map;
        map.put(1, EnumC3653l.CODE_128);
        map.put(2, EnumC3653l.CODE_39);
        map.put(4, EnumC3653l.CODE_93);
        map.put(8, EnumC3653l.CODABAR);
        map.put(16, EnumC3653l.DATA_MATRIX);
        map.put(32, EnumC3653l.EAN_13);
        map.put(64, EnumC3653l.EAN_8);
        map.put(128, EnumC3653l.ITF);
        map.put(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), EnumC3653l.QR_CODE);
        map.put(Integer.valueOf(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE), EnumC3653l.UPC_A);
        map.put(1024, EnumC3653l.UPC_E);
        map.put(2048, EnumC3653l.PDF417);
        map.put(4096, EnumC3653l.AZTEC);
    }

    public static boolean crashlytics() {
        AtomicReference atomicReference = crashlytics;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextLoadAd = C7854l.crashlytics().loadAd();
        C2673l c2673l = C16308l.f31895l;
        boolean z = C7269l.yandex(contextLoadAd, ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    public static void loadAd(C17781l c17781l, EnumC5421l enumC5421l) {
        C10950l c10950l = new C10950l();
        c10950l.yandex = enumC5421l;
        c17781l.loadAd(c10950l, EnumC7663l.ON_DEVICE_BARCODE_LOAD);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x0043 A[LOOP:0: B:11:0x003d->B:13:0x0043, LOOP_END] */
    public static C2401l yandex(C14605l c14605l) {
        Iterator it;
        int i = c14605l.yandex;
        appmetrica appmetricaVar = new appmetrica((byte) 0, 12);
        HashMap map = amazon;
        if (i == 0) {
            Collection collectionValues = map.values();
            if (collectionValues instanceof Collection) {
                Collection collection = collectionValues;
                appmetricaVar.m163default(collection.size() + appmetricaVar.f489l);
                if (collection instanceof AbstractC11819l) {
                    appmetricaVar.f489l = ((AbstractC11819l) collection).amazon(appmetricaVar.f489l, (Object[]) appmetricaVar.f492l);
                } else {
                    it = collectionValues.iterator();
                    while (it.hasNext()) {
                        appmetricaVar.m166static(it.next());
                    }
                }
            } else {
                it = collectionValues.iterator();
                while (it.hasNext()) {
                    appmetricaVar.m166static(it.next());
                }
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    appmetricaVar.m166static((EnumC3653l) entry.getValue());
                }
            }
        }
        C15848l c15848l = new C15848l();
        c15848l.f31100l = appmetricaVar.m165final();
        return new C2401l(c15848l);
    }
}
