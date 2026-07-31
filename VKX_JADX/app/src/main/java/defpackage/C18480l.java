package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٞۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18480l implements InterfaceC10952l, InterfaceC13158l, InterfaceC14091l, InterfaceC3634l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C1014l f36082l = new C1014l(1);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final short[] f36083l = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f36084l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f36085l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36086l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f36087l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f36088l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f36089l;

    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:112:0x028a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0290  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:162:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    public C18480l(C0444l c0444l, C9754l c9754l) throws Throwable {
        C15333l c15333lMetrica;
        char c;
        HashMap map;
        long j;
        long j2;
        String str;
        this.f36086l = 13;
        int i = 1;
        this.f36085l = true;
        C2237l c2237l = c0444l.yandex;
        C10675l c10675l = c0444l.loadAd;
        if (c2237l.yandex.isEmpty()) {
            C10675l.signatures().equals(c10675l);
        }
        this.f36084l = c10675l.tapsense();
        this.f36088l = c10675l.Signature();
        c10675l.getClass();
        c10675l.getClass();
        Throwable th = null;
        Map mapAdvert = c10675l.ad() == 0 ? null : c10675l.advert();
        if (mapAdvert != null) {
            AbstractC8481l.ads(mapAdvert.keySet());
        } else {
            Object[] objArr = C13825l.f26968l;
        }
        int iAd = c10675l.ad();
        C2237l c2237l2 = c0444l.yandex;
        char c2 = 3;
        if (iAd > 0) {
            Collection<C4281l> collectionValues = c10675l.advert().values();
            if (collectionValues == null) {
                c15333lMetrica = C15333l.f29966l;
            } else {
                C13698l c13698lYandex = AbstractC13675l.yandex();
                for (C4281l c4281l : collectionValues) {
                    int iM1521synchronized = c4281l.m1521synchronized();
                    int i2 = iM1521synchronized - 1;
                    if (iM1521synchronized == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        c13698lYandex.mo3668catch(c4281l.tapsense(), Long.valueOf(c4281l.Signature()));
                    } else if (i2 == 1) {
                        c13698lYandex.mo3668catch(c4281l.tapsense(), Boolean.valueOf(c4281l.license()));
                    } else if (i2 == 2) {
                        c13698lYandex.mo3668catch(c4281l.tapsense(), Double.valueOf(c4281l.pro()));
                    } else if (i2 == 3) {
                        c13698lYandex.mo3668catch(c4281l.tapsense(), c4281l.ad());
                    } else {
                        if (i2 != 4) {
                            C8339l.smaato("Could not serialize Flag for override: ".concat(String.valueOf(c4281l.tapsense())));
                            throw null;
                        }
                        c13698lYandex.mo3668catch(c4281l.tapsense(), c4281l.advert().ads());
                    }
                }
                c15333lMetrica = c13698lYandex.metrica(false);
            }
            if (!c15333lMetrica.isEmpty()) {
                HashMap map2 = new HashMap(c15333lMetrica);
                AbstractC16029l abstractC16029l = c2237l2.yandex;
                C4296l c4296l = new C4296l();
                AbstractC10199l abstractC10199lRemoteconfig = abstractC16029l.iterator();
                while (true) {
                    AbstractC6399l abstractC6399l = (AbstractC6399l) abstractC10199lRemoteconfig;
                    if (!abstractC6399l.hasNext()) {
                        for (String str2 : map2.keySet()) {
                            Object obj = map2.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    th = th;
                                    c = c2;
                                    map = map2;
                                } else {
                                    c = c2;
                                    map = map2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt > 9) {
                                            th = th;
                                        } else {
                                            int i3 = i;
                                            while (true) {
                                                if (i3 >= length) {
                                                    th = th;
                                                    j = 0;
                                                    if (jCharAt < 0 || jCharAt > 2305843009213693951L) {
                                                        j2 = j;
                                                        break;
                                                    } else {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                }
                                                int iCharAt = str2.charAt(i3) - '0';
                                                th = th;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i3++;
                                                    th = th;
                                                }
                                            }
                                        }
                                    }
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = th;
                                    }
                                    if (obj instanceof String) {
                                        c4296l.crashlytics(new C5748l(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        c4296l.crashlytics(new C5748l(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        c4296l.crashlytics(new C5748l(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        c4296l.crashlytics(new C5748l(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (!(obj instanceof Double)) {
                                            String strValueOf = String.valueOf(obj);
                                            C8339l.smaato(AbstractC9361l.advert(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                            throw th;
                                        }
                                        c4296l.crashlytics(new C5748l(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    map2 = map;
                                    th = th;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = th;
                                }
                                if (obj instanceof String) {
                                    c4296l.crashlytics(new C5748l(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    c4296l.crashlytics(new C5748l(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    c4296l.crashlytics(new C5748l(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    c4296l.crashlytics(new C5748l(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (!(obj instanceof Double)) {
                                        String strValueOf2 = String.valueOf(obj);
                                        C8339l.smaato(AbstractC9361l.advert(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                        throw th;
                                    }
                                    c4296l.crashlytics(new C5748l(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                map2 = map;
                                th = th;
                                i = 1;
                            } else {
                                c = c2;
                                map = map2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = th;
                            }
                            if (obj instanceof String) {
                                c4296l.crashlytics(new C5748l(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                c4296l.crashlytics(new C5748l(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                c4296l.crashlytics(new C5748l(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                c4296l.crashlytics(new C5748l(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (!(obj instanceof Double)) {
                                    String strValueOf3 = String.valueOf(obj);
                                    C8339l.smaato(AbstractC9361l.advert(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                    throw th;
                                }
                                c4296l.crashlytics(new C5748l(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            map2 = map;
                            th = th;
                            i = 1;
                        }
                        c2237l2 = new C2237l(c4296l.admob());
                        break;
                    }
                    C5748l c5748l = (C5748l) abstractC6399l.next();
                    String str3 = c5748l.f12140l;
                    long j3 = c5748l.f12141l;
                    Object objRemove = map2.remove(str3 == null ? Long.toString(j3) : str3);
                    if (objRemove == null) {
                        c4296l.crashlytics(c5748l);
                    } else if (objRemove instanceof String) {
                        c4296l.crashlytics(new C5748l(c5748l.f12141l, c5748l.f12140l, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        c4296l.crashlytics(new C5748l(c5748l.f12141l, c5748l.f12140l, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        c4296l.crashlytics(new C5748l(c5748l.f12141l, c5748l.f12140l, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        c4296l.crashlytics(new C5748l(c5748l.f12141l, c5748l.f12140l, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = c5748l.f12140l;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(AbstractC9361l.advert(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        c4296l.crashlytics(new C5748l(c5748l.f12141l, c5748l.f12140l, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((C13949l) c2237l2.yandex).f27247l.size() + 3;
        AbstractC12832l.loadAd(size, "expectedSize");
        C13698l c13698l = new C13698l(size, 11);
        AbstractC10199l abstractC10199lRemoteconfig2 = c2237l2.yandex.iterator();
        while (true) {
            AbstractC6399l abstractC6399l2 = (AbstractC6399l) abstractC10199lRemoteconfig2;
            if (!abstractC6399l2.hasNext()) {
                c13698l.mo3668catch("__phenotype_server_token", c10675l.license());
                c13698l.mo3668catch("__phenotype_snapshot_token", c10675l.tapsense());
                c13698l.mo3668catch("__phenotype_configuration_version", Long.valueOf(c10675l.pro()));
                this.f36087l = c13698l.metrica(false);
                this.f36089l = c9754l;
                return;
            }
            C5748l c5748l2 = (C5748l) abstractC6399l2.next();
            String string3 = c5748l2.f12140l;
            if (string3 == null) {
                string3 = Long.toString(c5748l2.f12141l);
            }
            c13698l.mo3668catch(string3, c5748l2.yandex());
        }
    }

    public static C1013l adcel(int i, DataInputStream dataInputStream) throws IOException {
        C9056l c9056lYandex;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C0458l c0458l = new C0458l(13);
            c0458l.signatures(Long.valueOf(j), "exo_len");
            c9056lYandex = C9056l.crashlytics.yandex(c0458l);
        } else {
            c9056lYandex = C1424l.yandex(dataInputStream);
        }
        return new C1013l(i2, utf, c9056lYandex);
    }

    public static int vip(C1013l c1013l, int i) {
        int iHashCode = c1013l.loadAd.hashCode() + (c1013l.yandex * 31);
        C9056l c9056l = c1013l.purchase;
        if (i < 2) {
            long jLoadAd = AbstractC11043l.loadAd(c9056l);
            return (iHashCode * 31) + ((int) (jLoadAd ^ (jLoadAd >>> 32)));
        }
        return c9056l.hashCode() + (iHashCode * 31);
    }

    public C15263l Signature(Function1 function1) {
        synchronized (((C6096l) this.f36084l)) {
            this.f36087l = AbstractC9905l.admob((Set) this.f36087l, function1);
            Unit unit = Unit.INSTANCE;
        }
        return new C15263l(this, function1, 17);
    }

    public void admob() {
        this.f36085l = false;
        ((ArrayList) this.f36087l).clear();
        ArrayList arrayList = (ArrayList) this.f36089l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            C14451l c14451l = (C14451l) this.f36088l;
            if (c14451l != null) {
                c14451l.f465l.amazon(iIntValue, 1, null);
            }
        }
        arrayList.clear();
    }

    public void ads(AudioTrack audioTrack, int i) {
        ArrayList arrayList = (ArrayList) this.f36089l;
        C7711l c7711l = (C7711l) this.f36084l;
        ArrayList arrayList2 = (ArrayList) this.f36087l;
        if (arrayList2.contains(audioTrack)) {
            arrayList.remove(arrayList2.indexOf(audioTrack));
            arrayList2.remove(audioTrack);
        } else {
            arrayList2.add(audioTrack);
            arrayList.add(Integer.valueOf(i));
        }
        boolean z = this.f36085l;
        if (z) {
            if (z && arrayList2.isEmpty()) {
                this.f36085l = false;
                c7711l.m2197abstract();
                return;
            } else {
                if (this.f36085l) {
                    c7711l.m2200instanceof();
                    return;
                }
                return;
            }
        }
        this.f36085l = true;
        c7711l.f16189l = new C10740l(6, this);
        View view = ((AbstractC11519l) c7711l.f16188l.get(0)).f5280l;
        if (view == null) {
            view = null;
        }
        ((C12656l) view).setEnabled(false);
        C12354l c12354l = c7711l.f16187l;
        if (c12354l == null) {
            c12354l = null;
        }
        AbstractC14412l abstractC14412l = c12354l.billing;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        C0878l c0878l = (C0878l) abstractC14412l;
        ViewOnClickListenerC9657l viewOnClickListenerC9657l = new ViewOnClickListenerC9657l(5, c7711l);
        C5447l c5447l = c0878l.admob;
        if (c5447l == null) {
            c5447l = null;
        }
        Drawable drawable = c5447l.getContext().getDrawable(R.drawable.ic_close);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        drawable.setTint(AbstractC13209l.yandex(R.attr.reborn_title_color));
        C5447l c5447l2 = c0878l.admob;
        if (c5447l2 == null) {
            c5447l2 = null;
        }
        c5447l2.setNavigationIcon(drawable);
        C5447l c5447l3 = c0878l.admob;
        if (c5447l3 == null) {
            c5447l3 = null;
        }
        c5447l3.setNavigationOnClickListener(viewOnClickListenerC9657l);
        c0878l.smaato(new C4228l(c7711l, 3));
        C11560l c11560l = c7711l.f30818l;
        if (c11560l == null) {
            c11560l = null;
        }
        c11560l.setPagingEnabled(false);
        C12354l c12354l2 = c7711l.f16187l;
        (c12354l2 != null ? c12354l2 : null).firebase(1);
        c7711l.f16190l.purchase(true);
        c7711l.m2200instanceof();
    }

    @Override // defpackage.InterfaceC13158l
    public boolean advert() {
        C3797l c3797l = (C3797l) this.f36087l;
        return ((File) c3797l.f7903l).exists() || ((File) c3797l.f7902l).exists();
    }

    @Override // defpackage.InterfaceC13158l
    public void amazon() {
        C3797l c3797l = (C3797l) this.f36087l;
        ((File) c3797l.f7903l).delete();
        ((File) c3797l.f7902l).delete();
    }

    public void billing(String str) {
        HashMap map = (HashMap) this.f36084l;
        if (str == null) {
            C8339l.metrica("id is required");
            return;
        }
        if (((C11260l) map.get(str)) == null) {
            return;
        }
        C11260l c11260l = (C11260l) map.get(str);
        if (c11260l == null) {
            C8339l.metrica(AbstractC15560l.Signature("springId ", str, " does not reference a registered spring"));
            return;
        }
        ((CopyOnWriteArraySet) this.f36088l).add(c11260l);
        if (this.f36085l) {
            this.f36085l = false;
            C14667l c14667l = (C14667l) this.f36087l;
            ChoreographerFrameCallbackC17929l choreographerFrameCallbackC17929l = c14667l.crashlytics;
            Choreographer choreographer = c14667l.loadAd;
            if (c14667l.amazon) {
                return;
            }
            c14667l.amazon = true;
            c14667l.purchase = SystemClock.uptimeMillis();
            choreographer.removeFrameCallback(choreographerFrameCallbackC17929l);
            choreographer.postFrameCallback(choreographerFrameCallbackC17929l);
        }
    }

    @Override // defpackage.InterfaceC14091l
    public byte[] crashlytics() {
        C9298l c9298l;
        if (this.f36085l && (c9298l = (C9298l) this.f36087l) != null) {
            return ((C15295l) this.f36084l).mopub(c9298l, (byte[]) this.f36088l);
        }
        C8339l.smaato("Ed448Signer not initialised for signature generation.");
        return null;
    }

    public void firebase() {
        Object objRemoveFirst;
        Set set;
        while (true) {
            synchronized (((C6096l) this.f36084l)) {
                if (((C11315l) this.f36088l).isEmpty()) {
                    this.f36085l = false;
                    return;
                } else {
                    objRemoveFirst = ((C11315l) this.f36088l).removeFirst();
                    set = (Set) this.f36087l;
                    Unit unit = Unit.INSTANCE;
                }
            }
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(objRemoveFirst);
                }
            } catch (Throwable th) {
                synchronized (((C6096l) this.f36084l)) {
                    ((C11315l) this.f36088l).clear();
                    this.f36085l = false;
                    this.f36089l = th;
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        switch (this.f36086l) {
            case 1:
                if (!(interfaceC9719l instanceof C13886l)) {
                    C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to SKIPJACK init - ", interfaceC9719l));
                } else {
                    byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
                    this.f36085l = z;
                    this.f36084l = new int[32];
                    this.f36088l = new int[32];
                    this.f36087l = new int[32];
                    this.f36089l = new int[32];
                    int i = 0;
                    while (true) {
                        int[] iArr = (int[]) this.f36084l;
                        if (i < 32) {
                            int i2 = i * 4;
                            iArr[i] = bArr[i2 % 10] & 255;
                            ((int[]) this.f36088l)[i] = bArr[(i2 + 1) % 10] & 255;
                            ((int[]) this.f36087l)[i] = bArr[(i2 + 2) % 10] & 255;
                            ((int[]) this.f36089l)[i] = bArr[(i2 + 3) % 10] & 255;
                            i++;
                        } else if (!(interfaceC9719l instanceof EnumC2441l)) {
                            ((C5911l) AbstractC8776l.purchase.get()).getClass();
                        } else {
                            C8339l.metrica("params should not be CryptoServicePurpose");
                        }
                    }
                }
                break;
            default:
                this.f36085l = z;
                if (interfaceC9719l instanceof C6114l) {
                    interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
                }
                if (z) {
                    this.f36087l = (C9298l) interfaceC9719l;
                    this.f36089l = null;
                } else {
                    this.f36087l = null;
                    this.f36089l = (C11104l) interfaceC9719l;
                }
                if (!(interfaceC9719l instanceof EnumC2441l)) {
                    AbstractC8776l.yandex();
                    ((C15295l) this.f36084l).reset();
                } else {
                    C8339l.metrica("params should not be CryptoServicePurpose");
                }
                break;
        }
    }

    public C11260l isPro() {
        C11260l c11260l = new C11260l(this);
        HashMap map = (HashMap) this.f36084l;
        String str = c11260l.crashlytics;
        if (map.containsKey(str)) {
            C8339l.metrica("spring is already registered");
            return null;
        }
        map.put(str, c11260l);
        return c11260l;
    }

    @Override // defpackage.InterfaceC13158l
    public void isVip(HashMap map) throws Throwable {
        if (this.f36085l) {
            subs(map);
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 8;
    }

    @Override // defpackage.InterfaceC14091l
    public boolean loadAd(byte[] bArr) {
        C11104l c11104l;
        if (!this.f36085l && (c11104l = (C11104l) this.f36089l) != null) {
            return ((C15295l) this.f36084l).signatures(c11104l, (byte[]) this.f36088l, bArr);
        }
        C8339l.smaato("Ed448Signer not initialised for verification");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int metrica(C13568l c13568l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, boolean z) {
        int i;
        byte b;
        int i2;
        int i3;
        C2703l c2703l = (C2703l) this.f36088l;
        C18333l c18333l = (C18333l) this.f36089l;
        if (this.f36085l) {
            return 0;
        }
        try {
            this.f36085l = true;
            C8634l c8634lAdvert = ((C7026l) this.f36087l).advert(c13568l, viewTreeObserverOnGlobalLayoutListenerC13840l);
            C3994l c3994l = (C3994l) c8634lAdvert.f17792l;
            int iFirebase = c3994l.firebase();
            while (true) {
                if (i >= iFirebase) {
                    b = true;
                    break;
                }
                C15730l c15730l = (C15730l) c3994l.smaato(i);
                i = (c15730l.amazon || c15730l.admob) ? 0 : i + 1;
                b = false;
                break;
            }
            int iFirebase2 = c3994l.firebase();
            for (int i4 = 0; i4 < iFirebase2; i4++) {
                C15730l c15730l2 = (C15730l) c3994l.smaato(i4);
                if (b != false || AbstractC3474l.amazon(c15730l2)) {
                    ((C3654l) this.f36084l).premium(c15730l2.crashlytics, (C18333l) this.f36089l, c15730l2.subs, true);
                    if (!c18333l.f35844l.isPro()) {
                        c2703l.yandex(c15730l2.yandex, c18333l, AbstractC3474l.amazon(c15730l2));
                        c18333l.clear();
                    }
                }
            }
            boolean zLoadAd = c2703l.loadAd(c8634lAdvert, z);
            if (c8634lAdvert.f17793l) {
                i2 = 0;
                break;
            }
            int iFirebase3 = c3994l.firebase();
            int i5 = 0;
            while (true) {
                if (i5 >= iFirebase3) {
                    i2 = 0;
                    break;
                }
                C15730l c15730l3 = (C15730l) c3994l.smaato(i5);
                if (!C1187l.loadAd(AbstractC3474l.subs(c15730l3, true), 0L) && c15730l3.crashlytics()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iFirebase4 = c3994l.firebase();
            for (int i6 = 0; i6 < iFirebase4; i6++) {
                if (((C15730l) c3994l.smaato(i6)).crashlytics()) {
                    i3 = 1;
                    return (zLoadAd ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zLoadAd ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.f36085l = false;
        }
    }

    @Override // defpackage.InterfaceC3634l
    public boolean mopub() throws C12397l {
        InterfaceC13311l c13292l;
        C17781l c17781l = (C17781l) this.f36087l;
        Context context = (Context) this.f36084l;
        if (((C16199l) this.f36089l) == null) {
            try {
                IBinder iBinderLoadAd = C7269l.crashlytics(context, C7269l.loadAd, "com.google.android.gms.vision.dynamite").loadAd("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                int i = AbstractBinderC14533l.billing;
                if (iBinderLoadAd == null) {
                    c13292l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderLoadAd.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    c13292l = iInterfaceQueryLocalInterface instanceof InterfaceC13311l ? (InterfaceC13311l) iInterfaceQueryLocalInterface : new C13292l(iBinderLoadAd, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 3);
                }
                C16199l c16199lM3627l = ((C13292l) c13292l).m3627l(new BinderC14844l(context), (C15360l) this.f36088l);
                this.f36089l = c16199lM3627l;
                if (c16199lM3627l == null && !this.f36085l) {
                    Log.d("LegacyBarcodeScanner", "Request optional module download.");
                    C9138l[] c9138lArr = AbstractC11698l.yandex;
                    C3365l c3365l = AbstractC3343l.f7125l;
                    Object[] objArr = {"barcode"};
                    AbstractC10392l.ads(1, objArr);
                    AbstractC11698l.yandex(context, new C4746l(1, objArr));
                    this.f36085l = true;
                    AbstractC14693l.loadAd(c17781l, EnumC5421l.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new C12397l("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                AbstractC14693l.loadAd(c17781l, EnumC5421l.NO_ERROR);
            } catch (RemoteException e) {
                throw new C12397l("Failed to create legacy barcode detector.", e);
            } catch (C2315l e2) {
                throw new C12397l("Failed to load deprecated vision dynamite module.", e2);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC13158l
    public void pro(C1013l c1013l) {
        this.f36085l = true;
    }

    public void purchase(Object obj) {
        synchronized (((C6096l) this.f36084l)) {
            Throwable th = (Throwable) this.f36089l;
            if (th != null) {
                throw new IllegalStateException("Can't process the event due to a previous failure", th);
            }
            ((C11315l) this.f36088l).addLast(obj);
            if (this.f36085l) {
                return;
            }
            this.f36085l = true;
            Unit unit = Unit.INSTANCE;
            firebase();
        }
    }

    public int remoteconfig(int i, int i2) {
        int i3 = i2 & 255;
        int i4 = (i2 >> 8) & 255;
        int i5 = ((int[]) this.f36089l)[i] ^ i4;
        short[] sArr = f36083l;
        int i6 = i3 ^ sArr[i5];
        int i7 = i4 ^ sArr[((int[]) this.f36087l)[i] ^ i6];
        int i8 = i6 ^ sArr[((int[]) this.f36088l)[i] ^ i7];
        return ((sArr[((int[]) this.f36084l)[i] ^ i8] ^ i7) << 8) + i8;
    }

    public int smaato(int i, int i2) {
        int i3 = (i2 >> 8) & 255;
        int i4 = i2 & 255;
        int i5 = ((int[]) this.f36084l)[i] ^ i4;
        short[] sArr = f36083l;
        int i6 = i3 ^ sArr[i5];
        int i7 = i4 ^ sArr[((int[]) this.f36088l)[i] ^ i6];
        int i8 = i6 ^ sArr[((int[]) this.f36087l)[i] ^ i7];
        return (i8 << 8) + (sArr[((int[]) this.f36089l)[i] ^ i8] ^ i7);
    }

    @Override // defpackage.InterfaceC13158l
    public void startapp(C1013l c1013l, boolean z) {
        this.f36085l = true;
    }

    @Override // defpackage.InterfaceC13158l
    public void subs(HashMap map) throws Throwable {
        C3797l c3797l = (C3797l) this.f36087l;
        DataOutputStream dataOutputStream = null;
        try {
            C7955l c7955lM1431volatile = c3797l.m1431volatile();
            C11255l c11255l = (C11255l) this.f36089l;
            if (c11255l == null) {
                this.f36089l = new C11255l(c7955lM1431volatile);
            } else {
                c11255l.yandex(c7955lM1431volatile);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((C11255l) this.f36089l);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iVip = 0;
                for (C1013l c1013l : map.values()) {
                    dataOutputStream2.writeInt(c1013l.yandex);
                    dataOutputStream2.writeUTF(c1013l.loadAd);
                    C1424l.crashlytics(c1013l.purchase, dataOutputStream2);
                    iVip += vip(c1013l, 2);
                }
                dataOutputStream2.writeInt(iVip);
                dataOutputStream2.close();
                ((File) c3797l.f7902l).delete();
                String str = AbstractC15323l.yandex;
                this.f36085l = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                AbstractC15323l.admob(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void subscription() {
        try {
            if (this.f36085l) {
                return;
            }
            this.f36085l = true;
            Context context = (Context) this.f36089l;
            if (context != null) {
                ((C18520l) this.f36088l).loadAd(context);
                context.unregisterComponentCallbacks((ComponentCallbacks2C14676l) this.f36087l);
            }
            ((WeakReference) this.f36084l).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    @Override // defpackage.InterfaceC13158l
    /* JADX INFO: renamed from: synchronized */
    public void mo2863synchronized(HashMap map, SparseArray sparseArray) throws Throwable {
        DataInputStream dataInputStream;
        AbstractC12442l.subscription(!this.f36085l);
        Cipher cipher = (Cipher) this.f36084l;
        C3797l c3797l = (C3797l) this.f36087l;
        File file = (File) c3797l.f7903l;
        File file2 = (File) c3797l.f7903l;
        File file3 = (File) c3797l.f7902l;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream3.readInt();
                    if (i < 0 || i > 2) {
                        AbstractC15323l.admob(dataInputStream3);
                    } else {
                        if ((dataInputStream3.readInt() & 1) == 0) {
                            dataInputStream = dataInputStream3;
                        } else if (cipher == null) {
                            AbstractC15323l.admob(dataInputStream3);
                        } else {
                            byte[] bArr = new byte[16];
                            dataInputStream3.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f36088l;
                                String str = AbstractC15323l.yandex;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                        try {
                            int i2 = dataInputStream.readInt();
                            int iVip = 0;
                            for (int i3 = 0; i3 < i2; i3++) {
                                C1013l c1013lAdcel = adcel(i, dataInputStream);
                                String str2 = c1013lAdcel.loadAd;
                                map.put(str2, c1013lAdcel);
                                sparseArray.put(c1013lAdcel.yandex, str2);
                                iVip += vip(c1013lAdcel, i);
                            }
                            int i4 = dataInputStream.readInt();
                            boolean z = dataInputStream.read() == -1;
                            if (i4 == iVip && z) {
                                AbstractC15323l.admob(dataInputStream);
                                return;
                            }
                            AbstractC15323l.admob(dataInputStream);
                        } catch (IOException unused) {
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                AbstractC15323l.admob(dataInputStream2);
                            }
                        } catch (Throwable th) {
                            dataInputStream2 = dataInputStream;
                            th = th;
                            if (dataInputStream2 != null) {
                                AbstractC15323l.admob(dataInputStream2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream3;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream3;
                }
            } catch (IOException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (((int[]) this.f36088l) == null) {
            C8339l.smaato("SKIPJACK engine not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        if (this.f36085l) {
            int i3 = (bArr[i] << 8) + (bArr[i + 1] & 255);
            int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
            int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
            int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
            int i7 = 0;
            for (int i8 = 0; i8 < 2; i8++) {
                int i9 = 0;
                while (i9 < 8) {
                    int iSmaato = smaato(i7, i3);
                    i7++;
                    i9++;
                    int i10 = i4;
                    i4 = iSmaato;
                    i3 = (i6 ^ iSmaato) ^ i7;
                    i6 = i5;
                    i5 = i10;
                }
                int i11 = 0;
                while (i11 < 8) {
                    int i12 = i7 + 1;
                    int i13 = (i4 ^ i3) ^ i12;
                    int iSmaato2 = smaato(i7, i3);
                    i11++;
                    i3 = i6;
                    i6 = i5;
                    i5 = i13;
                    i4 = iSmaato2;
                    i7 = i12;
                }
            }
            bArr2[i2] = (byte) (i3 >> 8);
            bArr2[i2 + 1] = (byte) i3;
            bArr2[i2 + 2] = (byte) (i4 >> 8);
            bArr2[i2 + 3] = (byte) i4;
            bArr2[i2 + 4] = (byte) (i5 >> 8);
            bArr2[i2 + 5] = (byte) i5;
            bArr2[i2 + 6] = (byte) (i6 >> 8);
            bArr2[i2 + 7] = (byte) i6;
        } else {
            int i14 = (bArr[i] << 8) + (bArr[i + 1] & 255);
            int i15 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
            int i16 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
            int i17 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
            int i18 = 31;
            for (int i19 = 0; i19 < 2; i19++) {
                int i20 = 0;
                while (i20 < 8) {
                    int iRemoteconfig = remoteconfig(i18, i15);
                    int i21 = (i16 ^ iRemoteconfig) ^ (i18 + 1);
                    i18--;
                    i20++;
                    int i22 = i17;
                    i17 = i14;
                    i14 = iRemoteconfig;
                    i15 = i21;
                    i16 = i22;
                }
                int i23 = 0;
                while (i23 < 8) {
                    int i24 = (i14 ^ i15) ^ (i18 + 1);
                    int iRemoteconfig2 = remoteconfig(i18, i15);
                    i18--;
                    i23++;
                    int i25 = i17;
                    i17 = i24;
                    i14 = iRemoteconfig2;
                    i15 = i16;
                    i16 = i25;
                }
            }
            bArr2[i2] = (byte) (i14 >> 8);
            bArr2[i2 + 1] = (byte) i14;
            bArr2[i2 + 2] = (byte) (i15 >> 8);
            bArr2[i2 + 3] = (byte) i15;
            bArr2[i2 + 4] = (byte) (i16 >> 8);
            bArr2[i2 + 5] = (byte) i16;
            bArr2[i2 + 6] = (byte) (i17 >> 8);
            bArr2[i2 + 7] = (byte) i17;
        }
        return 8;
    }

    @Override // defpackage.InterfaceC14091l
    public void update(byte b) throws IOException {
        ((C15295l) this.f36084l).write(b);
    }

    @Override // defpackage.InterfaceC3634l
    public ArrayList yandex(C3049l c3049l) throws C12397l {
        C17468l[] c17468lArrM4155l;
        if (((C16199l) this.f36089l) == null) {
            mopub();
        }
        C16199l c16199l = (C16199l) this.f36089l;
        if (c16199l == null) {
            throw new C12397l("Error initializing the legacy barcode scanner.", 14);
        }
        C14235l c14235l = new C14235l(c3049l.crashlytics, c3049l.amazon, 0, AbstractC16422l.yandex(c3049l.purchase), 0L);
        try {
            int i = c3049l.billing;
            if (i == -1) {
                BinderC14844l binderC14844l = new BinderC14844l(c3049l.yandex);
                Parcel parcelM743l = c16199l.m743l();
                int i2 = AbstractC12306l.yandex;
                parcelM743l.writeStrongBinder(binderC14844l);
                parcelM743l.writeInt(1);
                c14235l.writeToParcel(parcelM743l, 0);
                Parcel parcelM746l = c16199l.m746l(parcelM743l, 2);
                C17468l[] c17468lArr = (C17468l[]) parcelM746l.createTypedArray(C17468l.CREATOR);
                parcelM746l.recycle();
                c17468lArrM4155l = c17468lArr;
            } else if (i == 17) {
                c17468lArrM4155l = c16199l.m4155l(new BinderC14844l(null), c14235l);
            } else if (i == 35) {
                Image.Plane[] planeArrYandex = c3049l.yandex();
                AbstractC1051l.subs(planeArrYandex);
                c14235l.f27835l = planeArrYandex[0].getRowStride();
                c17468lArrM4155l = c16199l.m4155l(new BinderC14844l(planeArrYandex[0].getBuffer()), c14235l);
            } else {
                if (i != 842094169) {
                    throw new C12397l("Unsupported image format: " + c3049l.billing, 3);
                }
                c17468lArrM4155l = c16199l.m4155l(new BinderC14844l(AbstractC5941l.subs(c3049l)), c14235l);
            }
            ArrayList arrayList = new ArrayList();
            for (C17468l c17468l : c17468lArrM4155l) {
                arrayList.add(new C8130l(new C7214l(c17468l), c3049l.mopub));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C12397l("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // defpackage.InterfaceC3634l
    public void zzb() {
        C16199l c16199l = (C16199l) this.f36089l;
        if (c16199l != null) {
            try {
                c16199l.m741l(c16199l.m743l(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.f36089l = null;
        }
    }

    @Override // defpackage.InterfaceC14091l
    public void update(byte[] bArr, int i, int i2) throws IOException {
        ((C15295l) this.f36084l).write(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
    }

    @Override // defpackage.InterfaceC13158l
    public void signatures(long j) {
    }

    public C18480l(byte[] bArr) {
        this.f36086l = 5;
        this.f36084l = new C15295l(2);
        if (bArr != null) {
            this.f36088l = AbstractC14024l.crashlytics(bArr);
        } else {
            C6541l.subs("'context' cannot be null");
            throw null;
        }
    }

    public C18480l(Context context, C14605l c14605l, C17781l c17781l) {
        this.f36086l = 12;
        C15360l c15360l = new C15360l();
        this.f36088l = c15360l;
        this.f36084l = context;
        c15360l.f30037l = c14605l.yandex;
        this.f36087l = c17781l;
    }

    public C18480l(int i) {
        this.f36086l = i;
        switch (i) {
            case 4:
                break;
            case 8:
                this.f36084l = new C6096l(5);
                this.f36088l = new C11315l();
                this.f36087l = C5746l.f12138l;
                break;
            case 9:
                C14667l c14667l = new C14667l(Choreographer.getInstance());
                this.f36084l = new HashMap();
                this.f36088l = new CopyOnWriteArraySet();
                this.f36089l = new CopyOnWriteArraySet();
                this.f36085l = true;
                this.f36087l = c14667l;
                c14667l.yandex = this;
                break;
            default:
                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                break;
        }
    }

    public C18480l(C7711l c7711l) {
        this.f36086l = 6;
        this.f36084l = c7711l;
        this.f36087l = new ArrayList();
        this.f36089l = new ArrayList();
    }

    public C18480l(C15643l c15643l, C9754l c9754l) {
        this.f36086l = 13;
        this.f36085l = false;
        C15643l.signatures().equals(c15643l);
        this.f36084l = c15643l.tapsense();
        this.f36088l = c15643l.Signature();
        int i = AbstractC8481l.f17529l;
        Object[] objArr = C13825l.f26968l;
        int iAdvert = c15643l.advert() + 3;
        AbstractC12832l.loadAd(iAdvert, "expectedSize");
        C13698l c13698l = new C13698l(iAdvert, 11);
        for (C10725l c10725l : c15643l.ad()) {
            int iM2968package = c10725l.m2968package();
            int i2 = iM2968package - 1;
            if (iM2968package == 0) {
                throw null;
            }
            if (i2 == 0) {
                c13698l.mo3668catch(c10725l.tapsense(), Long.valueOf(c10725l.Signature()));
            } else if (i2 == 1) {
                c13698l.mo3668catch(c10725l.tapsense(), Boolean.valueOf(c10725l.license()));
            } else if (i2 == 2) {
                c13698l.mo3668catch(c10725l.tapsense(), Double.valueOf(c10725l.pro()));
            } else if (i2 == 3) {
                c13698l.mo3668catch(c10725l.tapsense(), c10725l.ad());
            } else if (i2 == 4) {
                c13698l.mo3668catch(c10725l.tapsense(), c10725l.advert().ads());
            }
        }
        c13698l.mo3668catch("__phenotype_server_token", c15643l.license());
        c13698l.mo3668catch("__phenotype_snapshot_token", c15643l.tapsense());
        c13698l.mo3668catch("__phenotype_configuration_version", Long.valueOf(c15643l.pro()));
        this.f36087l = c13698l.metrica(false);
        this.f36089l = c9754l;
    }

    public C18480l(C13177l c13177l) {
        this.f36086l = 2;
        this.f36084l = new WeakReference(c13177l);
        this.f36088l = new C18520l(this, c13177l);
        this.f36087l = new ComponentCallbacks2C14676l(1, this);
    }

    public C18480l(C3654l c3654l) {
        this.f36086l = 7;
        this.f36084l = c3654l;
        this.f36088l = new C2703l((C11103l) c3654l.f7703l.amazon);
        this.f36087l = new C7026l(16);
        this.f36089l = new C18333l();
    }

    public C18480l(InterfaceC14833l interfaceC14833l, C5978l c5978l, C16391l c16391l, InterfaceC5304l interfaceC5304l, boolean z) {
        this.f36086l = 0;
        this.f36084l = interfaceC14833l;
        this.f36088l = c5978l;
        this.f36087l = c16391l;
        this.f36089l = interfaceC5304l;
        this.f36085l = z;
    }

    public C18480l(C10038l c10038l, List list, List list2, boolean z, InterfaceC12932l interfaceC12932l) {
        this.f36086l = 10;
        this.f36084l = c10038l;
        this.f36088l = list;
        this.f36087l = list2;
        this.f36085l = z;
        if (this.f36085l && !((List) this.f36087l).isEmpty()) {
            interfaceC12932l = interfaceC12932l.mo246l(C9821l.f20008l);
        }
        this.f36089l = interfaceC12932l;
    }

    public C18480l(boolean z, C4358l c4358l) {
        this.f36086l = 11;
        this.f36085l = z;
        this.f36084l = c4358l;
        this.f36088l = AbstractC6791l.yandex(0.0f);
        this.f36087l = new ArrayList();
    }

    public C18480l(File file) {
        this.f36086l = 3;
        this.f36084l = null;
        this.f36088l = null;
        this.f36087l = new C3797l(file);
    }
}
