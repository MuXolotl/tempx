package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lٌَٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10184l extends AbstractC9453l {
    public static final Parcelable.Creator<C10184l> CREATOR;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C8395l f20746l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f20747l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f20748l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f20749l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C8593l f20750l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C3133l f20751l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f20752l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f20753l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f20755l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public MediaInfo f20756l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C5209l f20757l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f20759l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public JSONObject f20760l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f20761l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public double f20762l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f20763l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public double f20764l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20765l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long[] f20766l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public String f20767l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f20768l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f20769l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ArrayList f20758l = new ArrayList();

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final SparseArray f20754l = new SparseArray();

    static {
        AbstractC1051l.mopub("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new C13546l(25);
    }

    public C10184l(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, C5209l c5209l, C3133l c3133l, C8593l c8593l, C8395l c8395l) {
        this.f20756l = mediaInfo;
        this.f20755l = j;
        this.f20748l = i;
        this.f20762l = d;
        this.f20761l = i2;
        this.f20765l = i3;
        this.f20749l = j2;
        this.f20752l = j3;
        this.f20764l = d2;
        this.f20759l = z;
        this.f20766l = jArr;
        this.f20763l = i4;
        this.f20747l = i5;
        this.f20767l = str;
        if (str != null) {
            try {
                this.f20760l = new JSONObject(this.f20767l);
            } catch (JSONException unused) {
                this.f20760l = null;
                this.f20767l = null;
            }
        } else {
            this.f20760l = null;
        }
        this.f20753l = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            mopub(arrayList);
        }
        this.f20768l = z2;
        this.f20757l = c5209l;
        this.f20751l = c3133l;
        this.f20750l = c8593l;
        this.f20746l = c8395l;
        boolean z3 = false;
        if (c8395l != null && c8395l.f17356l) {
            z3 = true;
        }
        this.f20769l = z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x01af A[EDGE_INSN: B:109:0x01af->B:110:0x01b3 BREAK  A[LOOP:0: B:103:0x019d->B:107:0x01aa]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x024b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0251  */
    /* JADX WARN: Code duplicated, block: B:152:0x025b  */
    /* JADX WARN: Code duplicated, block: B:153:0x025e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0266  */
    /* JADX WARN: Code duplicated, block: B:157:0x026a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0271  */
    /* JADX WARN: Code duplicated, block: B:162:0x0281 A[LOOP:3: B:161:0x027f->B:162:0x0281, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:168:0x02be  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:178:0x0301  */
    /* JADX WARN: Code duplicated, block: B:182:0x0318  */
    /* JADX WARN: Code duplicated, block: B:183:0x031a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0323  */
    /* JADX WARN: Code duplicated, block: B:187:0x0329  */
    /* JADX WARN: Code duplicated, block: B:189:0x032d  */
    /* JADX WARN: Code duplicated, block: B:192:0x033e  */
    /* JADX WARN: Code duplicated, block: B:248:0x042b  */
    /* JADX WARN: Code duplicated, block: B:272:0x048a  */
    /* JADX WARN: Code duplicated, block: B:274:0x0490  */
    /* JADX WARN: Code duplicated, block: B:275:0x049e  */
    /* JADX WARN: Code duplicated, block: B:278:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:280:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:281:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:283:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:284:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:287:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:289:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:290:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:293:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:295:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:296:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:298:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:299:0x0501  */
    /* JADX WARN: Code duplicated, block: B:301:0x0509  */
    /* JADX WARN: Code duplicated, block: B:302:0x050b  */
    /* JADX WARN: Code duplicated, block: B:304:0x0513  */
    /* JADX WARN: Code duplicated, block: B:305:0x0515  */
    /* JADX WARN: Code duplicated, block: B:308:0x0524  */
    /* JADX WARN: Code duplicated, block: B:309:0x0529  */
    /* JADX WARN: Code duplicated, block: B:311:0x052c  */
    /* JADX WARN: Code duplicated, block: B:313:0x053d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0543  */
    /* JADX WARN: Code duplicated, block: B:318:0x054b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0553  */
    /* JADX WARN: Code duplicated, block: B:323:0x0562  */
    /* JADX WARN: Code duplicated, block: B:326:0x0570  */
    /* JADX WARN: Code duplicated, block: B:328:0x0578  */
    /* JADX WARN: Code duplicated, block: B:329:0x0587  */
    /* JADX WARN: Code duplicated, block: B:332:0x0591  */
    /* JADX WARN: Code duplicated, block: B:335:0x059d  */
    /* JADX WARN: Code duplicated, block: B:336:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:338:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:341:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:342:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:345:0x05de  */
    /* JADX WARN: Code duplicated, block: B:348:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:352:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:355:0x060b  */
    /* JADX WARN: Code duplicated, block: B:356:0x0616  */
    /* JADX WARN: Code duplicated, block: B:360:0x0646  */
    /* JADX WARN: Code duplicated, block: B:361:0x064b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0657  */
    /* JADX WARN: Code duplicated, block: B:367:0x0661  */
    /* JADX WARN: Code duplicated, block: B:368:0x0663  */
    /* JADX WARN: Code duplicated, block: B:377:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:379:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:386:0x05f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x05f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x030a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int billing(JSONObject jSONObject, int i) throws JSONException {
        JSONObject jSONObject2;
        int i2;
        double d;
        long[] jArr;
        int i3;
        JSONArray jSONArray;
        int length;
        SparseArray sparseArray;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        Integer num;
        JSONObject jSONObject3;
        Integer num2;
        C13328l c13328l;
        MediaInfo mediaInfo;
        Integer numAmazon;
        int iIntValue;
        C5209l c5209l;
        int i7;
        int i8;
        C3133l c3133l;
        C3133l c3133l2;
        int i9;
        JSONObject jSONObjectOptJSONObject;
        C8593l c8593l;
        JSONObject jSONObject4;
        String strYandex;
        int i10;
        JSONObject jSONObjectOptJSONObject2;
        String str;
        C14125l c14125l;
        Integer numAmazon2;
        int iIntValue2;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList2;
        int iOptInt;
        long jOptDouble;
        String str2;
        String str3;
        boolean zOptBoolean;
        C14125l c14125l2;
        ArrayList arrayList3;
        int i11;
        String str4;
        int i12;
        JSONObject jSONObjectOptJSONObject3;
        String strOptString;
        int iHashCode;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList4;
        JSONArray jSONArrayOptJSONArray3;
        ArrayList arrayList5;
        int i13;
        JSONObject jSONObjectOptJSONObject4;
        MediaInfo mediaInfo2;
        int i14;
        int i15;
        int i16;
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject5 != null) {
            try {
                ArrayList arrayList6 = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList6.add(itKeys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList6.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject5.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject5.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        long j = jSONObject2.getLong("mediaSessionId");
        int i17 = 1;
        if (j != this.f20755l) {
            this.f20755l = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i18 = 2;
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            if (string.equals("IDLE")) {
                i15 = 1;
            } else if (string.equals("PLAYING")) {
                i15 = 2;
            } else if (string.equals("PAUSED")) {
                i15 = 3;
            } else if (string.equals("BUFFERING")) {
                i15 = 4;
            } else {
                i15 = string.equals("LOADING") ? 5 : 0;
            }
            if (i15 != this.f20761l) {
                this.f20761l = i15;
                i2 |= 2;
            }
            if (i15 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i16 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i16 = 3;
                } else if (string2.equals("FINISHED")) {
                    i16 = 1;
                } else {
                    i16 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i16 != this.f20765l) {
                    this.f20765l = i16;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d2 = jSONObject2.getDouble("playbackRate");
            if (this.f20762l != d2) {
                this.f20762l = d2;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("currentTime")) {
            double d3 = jSONObject2.getDouble("currentTime");
            Pattern pattern = AbstractC15091l.yandex;
            long j2 = (long) (d3 * 1000.0d);
            if (j2 != this.f20749l) {
                this.f20749l = j2;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j3 = jSONObject2.getLong("supportedMediaCommands");
            if (j3 != this.f20752l) {
                this.f20752l = j3;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i == 0) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("volume");
            double d4 = jSONObject5.getDouble("level");
            d = 1000.0d;
            if (d4 != this.f20764l) {
                this.f20764l = d4;
                i2 |= 2;
            }
            boolean z = jSONObject5.getBoolean("muted");
            if (z != this.f20759l) {
                this.f20759l = z;
                i2 |= 2;
            }
        } else {
            d = 1000.0d;
        }
        JSONArray jSONArray2 = jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = AbstractC15091l.yandex;
        if (jSONArray2 == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray2.length()];
            for (int i19 = 0; i19 < jSONArray2.length(); i19++) {
                jArr[i19] = jSONArray2.getLong(i19);
            }
        }
        long[] jArr2 = this.f20766l;
        if (jArr == null) {
            if (jArr2 != null) {
                this.f20766l = jArr;
                i2 |= 2;
                break;
            }
        } else {
            if (jArr2 == null) {
                this.f20766l = jArr;
                i2 |= 2;
                break;
            }
            if (jArr2.length != jArr.length) {
                this.f20766l = jArr;
                i2 |= 2;
                break;
            }
            for (int i20 = 0; i20 < jArr.length; i20++) {
                if (this.f20766l[i20] != jArr[i20]) {
                    this.f20766l = jArr;
                    i2 |= 2;
                    break;
                }
            }
        }
        if (jSONObject2.has("customData")) {
            this.f20760l = jSONObject2.getJSONObject("customData");
            this.f20767l = null;
            i2 |= 2;
        }
        if (jSONObject2.has("media")) {
            JSONObject jSONObject6 = jSONObject2.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject6);
            MediaInfo mediaInfo4 = this.f20756l;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f20756l = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject6.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject2.has("currentItemId") && this.f20748l != (i14 = jSONObject2.getInt("currentItemId"))) {
            this.f20748l = i14;
            i2 |= 2;
        }
        int iOptInt2 = jSONObject2.optInt("preloadedItemId", 0);
        if (this.f20747l != iOptInt2) {
            this.f20747l = iOptInt2;
            i2 |= 16;
        }
        int iOptInt3 = jSONObject2.optInt("loadingItemId", 0);
        if (this.f20763l != iOptInt3) {
            this.f20763l = iOptInt3;
            i2 |= 2;
        }
        MediaInfo mediaInfo5 = this.f20756l;
        int i21 = mediaInfo5 == null ? -1 : mediaInfo5.f550l;
        int i22 = this.f20761l;
        int i23 = this.f20765l;
        int i24 = this.f20763l;
        ArrayList arrayList7 = this.f20758l;
        SparseArray sparseArray2 = this.f20754l;
        double d5 = d;
        if (i22 != 1) {
            if (jSONObject2.has("repeatMode")) {
                numAmazon = AbstractC6616l.amazon(jSONObject2.getString("repeatMode"));
                if (numAmazon == null) {
                    iIntValue = this.f20753l;
                } else {
                    iIntValue = numAmazon.intValue();
                }
                if (this.f20753l != iIntValue) {
                    this.f20753l = iIntValue;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            if (jSONObject2.has("items")) {
                jSONArray = jSONObject2.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                i4 = 0;
                while (i4 < length) {
                    sparseArray.put(i4, Integer.valueOf(jSONArray.getJSONObject(i4).getInt("itemId")));
                    i4++;
                    i18 = i18;
                }
                i18 = i18;
                arrayList = new ArrayList();
                i5 = 0;
                while (i5 < length) {
                    num = (Integer) sparseArray.get(i5);
                    int i25 = i17;
                    jSONObject3 = jSONArray.getJSONObject(i5);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        c13328l = null;
                    } else {
                        c13328l = (C13328l) arrayList7.get(num2.intValue());
                    }
                    if (c13328l != null) {
                        i3 |= c13328l.billing(jSONObject3) ? 1 : 0;
                        arrayList.add(c13328l);
                        if (i5 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                        i5++;
                        i17 = i25;
                    } else if (num.intValue() == this.f20748l) {
                        arrayList.add(new C13328l(jSONObject3));
                    } else {
                        arrayList.add(new C13328l(jSONObject3));
                    }
                    i3 = i25;
                    i5++;
                    i17 = i25;
                }
                i17 = i17;
                if (arrayList7.size() != length) {
                    i6 = 0;
                } else {
                    i6 = i17;
                }
                i3 |= i6 ^ 1;
                mopub(arrayList);
            } else {
                i17 = 1;
                i18 = 2;
            }
            if (i3 != 0) {
                i2 |= 8;
            }
        } else if (i23 != 1) {
            if (i23 != 2) {
                if (i23 == 3) {
                    if (i24 != 0) {
                        if (jSONObject2.has("repeatMode")) {
                            i3 = 0;
                        } else {
                            numAmazon = AbstractC6616l.amazon(jSONObject2.getString("repeatMode"));
                            if (numAmazon == null) {
                                iIntValue = this.f20753l;
                            } else {
                                iIntValue = numAmazon.intValue();
                            }
                            if (this.f20753l != iIntValue) {
                                this.f20753l = iIntValue;
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                        }
                        if (jSONObject2.has("items")) {
                            jSONArray = jSONObject2.getJSONArray("items");
                            length = jSONArray.length();
                            sparseArray = new SparseArray();
                            i4 = 0;
                            while (i4 < length) {
                                sparseArray.put(i4, Integer.valueOf(jSONArray.getJSONObject(i4).getInt("itemId")));
                                i4++;
                                i18 = i18;
                            }
                            i18 = i18;
                            arrayList = new ArrayList();
                            i5 = 0;
                            while (i5 < length) {
                                num = (Integer) sparseArray.get(i5);
                                int i26 = i17;
                                jSONObject3 = jSONArray.getJSONObject(i5);
                                num2 = (Integer) sparseArray2.get(num.intValue());
                                if (num2 == null) {
                                    c13328l = null;
                                } else {
                                    c13328l = (C13328l) arrayList7.get(num2.intValue());
                                }
                                if (c13328l != null) {
                                    i3 |= c13328l.billing(jSONObject3) ? 1 : 0;
                                    arrayList.add(c13328l);
                                    if (i5 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                                    }
                                    i5++;
                                    i17 = i26;
                                } else if (num.intValue() == this.f20748l) {
                                    arrayList.add(new C13328l(jSONObject3));
                                } else {
                                    arrayList.add(new C13328l(jSONObject3));
                                }
                                i3 = i26;
                                i5++;
                                i17 = i26;
                            }
                            i17 = i17;
                            if (arrayList7.size() != length) {
                                i6 = 0;
                            } else {
                                i6 = i17;
                            }
                            i3 |= i6 ^ 1;
                            mopub(arrayList);
                        } else {
                            i17 = 1;
                            i18 = 2;
                        }
                        if (i3 != 0) {
                            i2 |= 8;
                        }
                    }
                }
                this.f20748l = r4;
                this.f20763l = r4;
                this.f20747l = r4;
                if (!arrayList7.isEmpty()) {
                    i2 |= 8;
                    this.f20753l = 0;
                    arrayList7.clear();
                    sparseArray2.clear();
                }
            } else if (i21 == 2) {
                if (jSONObject2.has("repeatMode")) {
                    i3 = 0;
                } else {
                    numAmazon = AbstractC6616l.amazon(jSONObject2.getString("repeatMode"));
                    if (numAmazon == null) {
                        iIntValue = this.f20753l;
                    } else {
                        iIntValue = numAmazon.intValue();
                    }
                    if (this.f20753l != iIntValue) {
                        this.f20753l = iIntValue;
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                }
                if (jSONObject2.has("items")) {
                    jSONArray = jSONObject2.getJSONArray("items");
                    length = jSONArray.length();
                    sparseArray = new SparseArray();
                    i4 = 0;
                    while (i4 < length) {
                        sparseArray.put(i4, Integer.valueOf(jSONArray.getJSONObject(i4).getInt("itemId")));
                        i4++;
                        i18 = i18;
                    }
                    i18 = i18;
                    arrayList = new ArrayList();
                    i5 = 0;
                    while (i5 < length) {
                        num = (Integer) sparseArray.get(i5);
                        int i27 = i17;
                        jSONObject3 = jSONArray.getJSONObject(i5);
                        num2 = (Integer) sparseArray2.get(num.intValue());
                        if (num2 == null) {
                            c13328l = null;
                        } else {
                            c13328l = (C13328l) arrayList7.get(num2.intValue());
                        }
                        if (c13328l != null) {
                            i3 |= c13328l.billing(jSONObject3) ? 1 : 0;
                            arrayList.add(c13328l);
                            if (i5 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                            }
                            i5++;
                            i17 = i27;
                        } else if (num.intValue() == this.f20748l) {
                            arrayList.add(new C13328l(jSONObject3));
                        } else {
                            arrayList.add(new C13328l(jSONObject3));
                        }
                        i3 = i27;
                        i5++;
                        i17 = i27;
                    }
                    i17 = i17;
                    if (arrayList7.size() != length) {
                        i6 = 0;
                    } else {
                        i6 = i17;
                    }
                    i3 |= i6 ^ 1;
                    mopub(arrayList);
                } else {
                    i17 = 1;
                    i18 = 2;
                }
                if (i3 != 0) {
                    i2 |= 8;
                }
            }
            this.f20748l = r4;
            this.f20763l = r4;
            this.f20747l = r4;
            if (!arrayList7.isEmpty()) {
                i2 |= 8;
                this.f20753l = 0;
                arrayList7.clear();
                sparseArray2.clear();
            }
        } else if (i24 != 0) {
            if (jSONObject2.has("repeatMode")) {
                i3 = 0;
            } else {
                numAmazon = AbstractC6616l.amazon(jSONObject2.getString("repeatMode"));
                if (numAmazon == null) {
                    iIntValue = this.f20753l;
                } else {
                    iIntValue = numAmazon.intValue();
                }
                if (this.f20753l != iIntValue) {
                    this.f20753l = iIntValue;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
            if (jSONObject2.has("items")) {
                jSONArray = jSONObject2.getJSONArray("items");
                length = jSONArray.length();
                sparseArray = new SparseArray();
                i4 = 0;
                while (i4 < length) {
                    sparseArray.put(i4, Integer.valueOf(jSONArray.getJSONObject(i4).getInt("itemId")));
                    i4++;
                    i18 = i18;
                }
                i18 = i18;
                arrayList = new ArrayList();
                i5 = 0;
                while (i5 < length) {
                    num = (Integer) sparseArray.get(i5);
                    int i28 = i17;
                    jSONObject3 = jSONArray.getJSONObject(i5);
                    num2 = (Integer) sparseArray2.get(num.intValue());
                    if (num2 == null) {
                        c13328l = null;
                    } else {
                        c13328l = (C13328l) arrayList7.get(num2.intValue());
                    }
                    if (c13328l != null) {
                        i3 |= c13328l.billing(jSONObject3) ? 1 : 0;
                        arrayList.add(c13328l);
                        if (i5 != ((Integer) sparseArray2.get(num.intValue())).intValue()) {
                        }
                        i5++;
                        i17 = i28;
                    } else if (num.intValue() == this.f20748l || (mediaInfo = this.f20756l) == null) {
                        arrayList.add(new C13328l(jSONObject3));
                    } else {
                        C13328l c13328lM1823protected = new C5501l(mediaInfo).m1823protected();
                        c13328lM1823protected.billing(jSONObject3);
                        arrayList.add(c13328lM1823protected);
                    }
                    i3 = i28;
                    i5++;
                    i17 = i28;
                }
                i17 = i17;
                if (arrayList7.size() != length) {
                    i6 = 0;
                } else {
                    i6 = i17;
                }
                i3 |= i6 ^ 1;
                mopub(arrayList);
            } else {
                i17 = 1;
                i18 = 2;
            }
            if (i3 != 0) {
                i2 |= 8;
            }
        } else {
            this.f20748l = r4;
            this.f20763l = r4;
            this.f20747l = r4;
            if (!arrayList7.isEmpty()) {
                i2 |= 8;
                this.f20753l = 0;
                arrayList7.clear();
                sparseArray2.clear();
            }
        }
        int i29 = i2;
        JSONObject jSONObjectOptJSONObject6 = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<C5209l> creator = C5209l.CREATOR;
        if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("currentBreakTime") && jSONObjectOptJSONObject6.has("currentBreakClipTime")) {
            try {
                long j4 = jSONObjectOptJSONObject6.getLong("currentBreakTime");
                Pattern pattern3 = AbstractC15091l.yandex;
                long j5 = j4 * 1000;
                long j6 = jSONObjectOptJSONObject6.getLong("currentBreakClipTime") * 1000;
                String strYandex2 = AbstractC15091l.yandex(jSONObjectOptJSONObject6, "breakId");
                String strYandex3 = AbstractC15091l.yandex(jSONObjectOptJSONObject6, "breakClipId");
                long jOptLong = jSONObjectOptJSONObject6.optLong("whenSkippable", -1L);
                if (jOptLong != -1) {
                    jOptLong *= 1000;
                }
                c5209l = new C5209l(j5, j6, strYandex2, strYandex3, jOptLong);
            } catch (JSONException e) {
                C0022l c0022l = C5209l.f11287l;
                Log.e(c0022l.yandex, c0022l.amazon("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e);
                c5209l = null;
            }
        } else {
            c5209l = null;
        }
        C5209l c5209l2 = this.f20757l;
        if ((c5209l2 == null && c5209l != null) || (c5209l2 != null && !c5209l2.equals(c5209l))) {
            this.f20768l = (c5209l == null || (c5209l.f11288l == null && c5209l.f11292l == null)) ? 0 : i17;
            this.f20757l = c5209l;
            i29 |= 32;
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("videoInfo");
        C0022l c0022l2 = C3133l.f6732l;
        if (jSONObjectOptJSONObject7 != null) {
            try {
                String string3 = jSONObjectOptJSONObject7.getString("hdrType");
                int iHashCode2 = string3.hashCode();
                if (iHashCode2 != 3218) {
                    if (iHashCode2 != 103158) {
                        if (iHashCode2 != 113729) {
                            if (iHashCode2 == 99136405 && string3.equals("hdr10")) {
                                i8 = i18;
                                i7 = i17;
                            } else {
                                i7 = i17;
                                try {
                                    Object[] objArr = new Object[i7];
                                    objArr[0] = string3;
                                    c0022l2.loadAd("Unknown HDR type: %s", objArr);
                                    i8 = 0;
                                } catch (JSONException e2) {
                                    e = e2;
                                    c0022l2.yandex(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                    c3133l = null;
                                }
                            }
                        } else if (string3.equals("sdr")) {
                            i8 = i17;
                            i7 = i8;
                        } else {
                            i7 = i17;
                            Object[] objArr2 = new Object[i7];
                            objArr2[0] = string3;
                            c0022l2.loadAd("Unknown HDR type: %s", objArr2);
                            i8 = 0;
                        }
                    } else if (string3.equals("hdr")) {
                        i7 = i17;
                        i8 = 4;
                    } else {
                        i7 = i17;
                        Object[] objArr3 = new Object[i7];
                        objArr3[0] = string3;
                        c0022l2.loadAd("Unknown HDR type: %s", objArr3);
                        i8 = 0;
                    }
                } else if (string3.equals("dv")) {
                    i7 = i17;
                    i8 = 3;
                } else {
                    i7 = i17;
                    Object[] objArr4 = new Object[i7];
                    objArr4[0] = string3;
                    c0022l2.loadAd("Unknown HDR type: %s", objArr4);
                    i8 = 0;
                }
                c3133l = new C3133l(jSONObjectOptJSONObject7.getInt("width"), jSONObjectOptJSONObject7.getInt("height"), i8);
            } catch (JSONException e3) {
                e = e3;
                i7 = i17;
            }
            c3133l2 = this.f20751l;
            if ((c3133l2 != null && c3133l != null) || (c3133l2 != null && !c3133l2.equals(c3133l))) {
                this.f20751l = c3133l;
                i29 |= 64;
            }
            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.f20756l) != null) {
                mediaInfo2.billing(jSONObject2.getJSONObject("breakInfo"));
                i29 |= 2;
            }
            if (jSONObject2.has("queueData")) {
                jSONObject4 = jSONObject2.getJSONObject("queueData");
                if (jSONObject4 == null) {
                    i29 = i29;
                    jOptDouble = -1;
                    c14125l2 = null;
                    i11 = 0;
                    iIntValue2 = 0;
                    iOptInt = 0;
                    zOptBoolean = false;
                    str4 = null;
                    str2 = null;
                    arrayList3 = null;
                    str3 = null;
                } else {
                    strYandex = AbstractC15091l.yandex(jSONObject4, "id");
                    String strYandex4 = AbstractC15091l.yandex(jSONObject4, "entity");
                    switch (jSONObject4.optString("queueType")) {
                        case "PODCAST_SERIES":
                            i10 = 5;
                            break;
                        case "RADIO_STATION":
                            i10 = 4;
                            break;
                        case "PLAYLIST":
                            i10 = i18;
                            break;
                        case "AUDIOBOOK":
                            i10 = 3;
                            break;
                        case "TV_SERIES":
                            i10 = 6;
                            break;
                        case "ALBUM":
                            i10 = i7;
                            break;
                        case "MOVIE":
                            i10 = 9;
                            break;
                        case "VIDEO_PLAYLIST":
                            i10 = 7;
                            break;
                        case "LIVE_TV":
                            i10 = 8;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    String strYandex5 = AbstractC15091l.yandex(jSONObject4, "name");
                    if (jSONObject4.has("containerMetadata")) {
                        jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("containerMetadata");
                    } else {
                        jSONObjectOptJSONObject2 = null;
                    }
                    if (jSONObjectOptJSONObject2 != null) {
                        strOptString = jSONObjectOptJSONObject2.optString("containerType", "");
                        iHashCode = strOptString.hashCode();
                        if (iHashCode != 6924225) {
                            int i30 = strOptString.equals("AUDIOBOOK_CONTAINER") ? 1 : 0;
                            String strYandex6 = AbstractC15091l.yandex(jSONObjectOptJSONObject2, "title");
                            jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("sections");
                            if (jSONArrayOptJSONArray2 != null) {
                                arrayList4 = new ArrayList();
                                i13 = 0;
                                while (i13 < jSONArrayOptJSONArray2.length()) {
                                    jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i13);
                                    int i31 = i13;
                                    if (jSONObjectOptJSONObject4 != null) {
                                        C1056l c1056l = new C1056l(0);
                                        c1056l.mopub(jSONObjectOptJSONObject4);
                                        arrayList4.add(c1056l);
                                    }
                                    i13 = i31 + 1;
                                    strYandex = strYandex;
                                }
                            } else {
                                arrayList4 = null;
                            }
                            str = strYandex;
                            jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("containerImages");
                            if (jSONArrayOptJSONArray3 != null) {
                                arrayList5 = new ArrayList();
                                AbstractC18344l.yandex(arrayList5, jSONArrayOptJSONArray3);
                            } else {
                                arrayList5 = null;
                            }
                            double dOptDouble = jSONObjectOptJSONObject2.optDouble("containerDuration", 0.0d);
                            c14125l = new C14125l();
                            c14125l.f27622l = i30;
                            c14125l.f27621l = strYandex6;
                            c14125l.f27620l = arrayList4;
                            c14125l.f27624l = arrayList5;
                            c14125l.f27623l = dOptDouble;
                        } else if (iHashCode == 828666841) {
                            strOptString.equals("GENERIC_CONTAINER");
                        }
                        String strYandex7 = AbstractC15091l.yandex(jSONObjectOptJSONObject2, "title");
                        jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("sections");
                        if (jSONArrayOptJSONArray2 != null) {
                            arrayList4 = new ArrayList();
                            i13 = 0;
                            while (i13 < jSONArrayOptJSONArray2.length()) {
                                jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i13);
                                int i32 = i13;
                                if (jSONObjectOptJSONObject4 != null) {
                                    C1056l c1056l2 = new C1056l(0);
                                    c1056l2.mopub(jSONObjectOptJSONObject4);
                                    arrayList4.add(c1056l2);
                                }
                                i13 = i32 + 1;
                                strYandex = strYandex;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        str = strYandex;
                        jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("containerImages");
                        if (jSONArrayOptJSONArray3 != null) {
                            arrayList5 = new ArrayList();
                            AbstractC18344l.yandex(arrayList5, jSONArrayOptJSONArray3);
                        } else {
                            arrayList5 = null;
                        }
                        double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("containerDuration", 0.0d);
                        c14125l = new C14125l();
                        c14125l.f27622l = i30;
                        c14125l.f27621l = strYandex7;
                        c14125l.f27620l = arrayList4;
                        c14125l.f27624l = arrayList5;
                        c14125l.f27623l = dOptDouble2;
                    } else {
                        i29 = i29;
                        str = strYandex;
                        c14125l = null;
                    }
                    numAmazon2 = AbstractC6616l.amazon(jSONObject4.optString("repeatMode"));
                    if (numAmazon2 != null) {
                        iIntValue2 = numAmazon2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    jSONArrayOptJSONArray = jSONObject4.optJSONArray("items");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList2 = new ArrayList();
                        for (i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                            jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i12);
                            if (jSONObjectOptJSONObject3 != null) {
                                try {
                                    arrayList2.add(new C13328l(jSONObjectOptJSONObject3));
                                } catch (JSONException unused2) {
                                }
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    iOptInt = jSONObject4.optInt("startIndex", 0);
                    if (jSONObject4.has("startTime")) {
                        jOptDouble = (long) (jSONObject4.optDouble("startTime", -1L) * d5);
                    } else {
                        jOptDouble = -1;
                    }
                    str2 = strYandex4;
                    str3 = strYandex5;
                    zOptBoolean = jSONObject4.optBoolean("shuffle");
                    c14125l2 = c14125l;
                    arrayList3 = arrayList2;
                    i11 = i10;
                    str4 = str;
                }
                C8395l c8395l = new C8395l();
                c8395l.f17355l = str4;
                c8395l.f17354l = str2;
                c8395l.f17351l = i11;
                c8395l.f17358l = str3;
                c8395l.f17357l = c14125l2;
                c8395l.f17360l = iIntValue2;
                c8395l.f17352l = arrayList3;
                c8395l.f17353l = iOptInt;
                c8395l.f17359l = jOptDouble;
                c8395l.f17356l = zOptBoolean;
                this.f20746l = c8395l;
                if (this.f20769l != zOptBoolean) {
                    this.f20769l = zOptBoolean;
                    i9 = i29 | 8;
                }
                if (jSONObject2.has("liveSeekableRange")) {
                    i9 |= 2;
                    jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
                    Parcelable.Creator<C8593l> creator2 = C8593l.CREATOR;
                    if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject.has("start") && jSONObjectOptJSONObject.has("end")) {
                        try {
                            double d6 = jSONObjectOptJSONObject.getDouble("start");
                            Pattern pattern4 = AbstractC15091l.yandex;
                            c8593l = new C8593l((long) (d6 * d5), (long) (jSONObjectOptJSONObject.getDouble("end") * d5), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                        } catch (JSONException unused3) {
                            C0022l c0022l3 = C8593l.f17710l;
                            Log.e(c0022l3.yandex, c0022l3.amazon("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject.toString()), new Object[0]));
                            c8593l = null;
                        }
                    } else {
                        c8593l = null;
                    }
                    this.f20750l = c8593l;
                } else {
                    if (this.f20750l != null) {
                        i9 |= 2;
                    }
                    this.f20750l = null;
                }
                return i9;
            }
            i29 = i29;
            i9 = i29;
            if (jSONObject2.has("liveSeekableRange")) {
                i9 |= 2;
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
                Parcelable.Creator<C8593l> creator3 = C8593l.CREATOR;
                if (jSONObjectOptJSONObject == null) {
                    c8593l = null;
                } else {
                    double d7 = jSONObjectOptJSONObject.getDouble("start");
                    Pattern pattern5 = AbstractC15091l.yandex;
                    c8593l = new C8593l((long) (d7 * d5), (long) (jSONObjectOptJSONObject.getDouble("end") * d5), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                }
                this.f20750l = c8593l;
            } else {
                if (this.f20750l != null) {
                    i9 |= 2;
                }
                this.f20750l = null;
            }
            return i9;
        }
        i7 = i17;
        c3133l = null;
        c3133l2 = this.f20751l;
        if (c3133l2 != null) {
            this.f20751l = c3133l;
            i29 |= 64;
        } else {
            this.f20751l = c3133l;
            i29 |= 64;
        }
        if (jSONObject2.has("breakInfo")) {
            mediaInfo2.billing(jSONObject2.getJSONObject("breakInfo"));
            i29 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            jSONObject4 = jSONObject2.getJSONObject("queueData");
            if (jSONObject4 == null) {
                i29 = i29;
                jOptDouble = -1;
                c14125l2 = null;
                i11 = 0;
                iIntValue2 = 0;
                iOptInt = 0;
                zOptBoolean = false;
                str4 = null;
                str2 = null;
                arrayList3 = null;
                str3 = null;
            } else {
                strYandex = AbstractC15091l.yandex(jSONObject4, "id");
                String strYandex8 = AbstractC15091l.yandex(jSONObject4, "entity");
                switch (jSONObject4.optString("queueType")) {
                    case -1803151310:
                        if (!r8.equals("PODCAST_SERIES")) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case -1758903120:
                        if (!r8.equals("RADIO_STATION")) {
                            i10 = 4;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case -1632865838:
                        if (!r8.equals("PLAYLIST")) {
                            i10 = i18;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case -1319760993:
                        if (!r8.equals("AUDIOBOOK")) {
                            i10 = 3;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case -1088524588:
                        if (!r8.equals("TV_SERIES")) {
                            i10 = 6;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case 62359119:
                        if (!r8.equals("ALBUM")) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case 73549584:
                        if (!r8.equals("MOVIE")) {
                            i10 = 9;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case 393100598:
                        if (!r8.equals("VIDEO_PLAYLIST")) {
                            i10 = 7;
                        } else {
                            i10 = 0;
                        }
                        break;
                    case 902303413:
                        if (!r8.equals("LIVE_TV")) {
                            i10 = 8;
                        } else {
                            i10 = 0;
                        }
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                String strYandex9 = AbstractC15091l.yandex(jSONObject4, "name");
                if (jSONObject4.has("containerMetadata")) {
                    jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("containerMetadata");
                } else {
                    jSONObjectOptJSONObject2 = null;
                }
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString = jSONObjectOptJSONObject2.optString("containerType", "");
                    iHashCode = strOptString.hashCode();
                    if (iHashCode != 6924225) {
                        if (strOptString.equals("AUDIOBOOK_CONTAINER")) {
                        }
                        String strYandex10 = AbstractC15091l.yandex(jSONObjectOptJSONObject2, "title");
                        jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("sections");
                        if (jSONArrayOptJSONArray2 != null) {
                            arrayList4 = new ArrayList();
                            i13 = 0;
                            while (i13 < jSONArrayOptJSONArray2.length()) {
                                jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i13);
                                int i33 = i13;
                                if (jSONObjectOptJSONObject4 != null) {
                                    C1056l c1056l3 = new C1056l(0);
                                    c1056l3.mopub(jSONObjectOptJSONObject4);
                                    arrayList4.add(c1056l3);
                                }
                                i13 = i33 + 1;
                                strYandex = strYandex;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        str = strYandex;
                        jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("containerImages");
                        if (jSONArrayOptJSONArray3 != null) {
                            arrayList5 = new ArrayList();
                            AbstractC18344l.yandex(arrayList5, jSONArrayOptJSONArray3);
                        } else {
                            arrayList5 = null;
                        }
                        double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("containerDuration", 0.0d);
                        c14125l = new C14125l();
                        c14125l.f27622l = i30;
                        c14125l.f27621l = strYandex10;
                        c14125l.f27620l = arrayList4;
                        c14125l.f27624l = arrayList5;
                        c14125l.f27623l = dOptDouble3;
                    } else if (iHashCode == 828666841) {
                        strOptString.equals("GENERIC_CONTAINER");
                    }
                    String strYandex11 = AbstractC15091l.yandex(jSONObjectOptJSONObject2, "title");
                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("sections");
                    if (jSONArrayOptJSONArray2 != null) {
                        arrayList4 = new ArrayList();
                        i13 = 0;
                        while (i13 < jSONArrayOptJSONArray2.length()) {
                            jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i13);
                            int i34 = i13;
                            if (jSONObjectOptJSONObject4 != null) {
                                C1056l c1056l4 = new C1056l(0);
                                c1056l4.mopub(jSONObjectOptJSONObject4);
                                arrayList4.add(c1056l4);
                            }
                            i13 = i34 + 1;
                            strYandex = strYandex;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    str = strYandex;
                    jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray3 != null) {
                        arrayList5 = new ArrayList();
                        AbstractC18344l.yandex(arrayList5, jSONArrayOptJSONArray3);
                    } else {
                        arrayList5 = null;
                    }
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("containerDuration", 0.0d);
                    c14125l = new C14125l();
                    c14125l.f27622l = i30;
                    c14125l.f27621l = strYandex11;
                    c14125l.f27620l = arrayList4;
                    c14125l.f27624l = arrayList5;
                    c14125l.f27623l = dOptDouble4;
                } else {
                    i29 = i29;
                    str = strYandex;
                    c14125l = null;
                }
                numAmazon2 = AbstractC6616l.amazon(jSONObject4.optString("repeatMode"));
                if (numAmazon2 != null) {
                    iIntValue2 = numAmazon2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                jSONArrayOptJSONArray = jSONObject4.optJSONArray("items");
                if (jSONArrayOptJSONArray != null) {
                    arrayList2 = new ArrayList();
                    while (i12 < jSONArrayOptJSONArray.length()) {
                        jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i12);
                        if (jSONObjectOptJSONObject3 != null) {
                            arrayList2.add(new C13328l(jSONObjectOptJSONObject3));
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                iOptInt = jSONObject4.optInt("startIndex", 0);
                if (jSONObject4.has("startTime")) {
                    jOptDouble = (long) (jSONObject4.optDouble("startTime", -1L) * d5);
                } else {
                    jOptDouble = -1;
                }
                str2 = strYandex8;
                str3 = strYandex9;
                zOptBoolean = jSONObject4.optBoolean("shuffle");
                c14125l2 = c14125l;
                arrayList3 = arrayList2;
                i11 = i10;
                str4 = str;
            }
            C8395l c8395l2 = new C8395l();
            c8395l2.f17355l = str4;
            c8395l2.f17354l = str2;
            c8395l2.f17351l = i11;
            c8395l2.f17358l = str3;
            c8395l2.f17357l = c14125l2;
            c8395l2.f17360l = iIntValue2;
            c8395l2.f17352l = arrayList3;
            c8395l2.f17353l = iOptInt;
            c8395l2.f17359l = jOptDouble;
            c8395l2.f17356l = zOptBoolean;
            this.f20746l = c8395l2;
            if (this.f20769l != zOptBoolean) {
                this.f20769l = zOptBoolean;
                i9 = i29 | 8;
            }
            if (jSONObject2.has("liveSeekableRange")) {
                i9 |= 2;
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
                Parcelable.Creator<C8593l> creator4 = C8593l.CREATOR;
                if (jSONObjectOptJSONObject == null) {
                    c8593l = null;
                } else {
                    double d8 = jSONObjectOptJSONObject.getDouble("start");
                    Pattern pattern6 = AbstractC15091l.yandex;
                    c8593l = new C8593l((long) (d8 * d5), (long) (jSONObjectOptJSONObject.getDouble("end") * d5), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                }
                this.f20750l = c8593l;
            } else {
                if (this.f20750l != null) {
                    i9 |= 2;
                }
                this.f20750l = null;
            }
            return i9;
        }
        i29 = i29;
        i9 = i29;
        if (jSONObject2.has("liveSeekableRange")) {
            i9 |= 2;
            jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
            Parcelable.Creator<C8593l> creator5 = C8593l.CREATOR;
            if (jSONObjectOptJSONObject == null) {
                c8593l = null;
            } else {
                double d9 = jSONObjectOptJSONObject.getDouble("start");
                Pattern pattern7 = AbstractC15091l.yandex;
                c8593l = new C8593l((long) (d9 * d5), (long) (jSONObjectOptJSONObject.getDouble("end") * d5), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
            }
            this.f20750l = c8593l;
        } else {
            if (this.f20750l != null) {
                i9 |= 2;
            }
            this.f20750l = null;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof C10184l) {
                C10184l c10184l = (C10184l) obj;
                if ((this.f20760l == null) == (c10184l.f20760l == null) && this.f20755l == c10184l.f20755l && this.f20748l == c10184l.f20748l && this.f20762l == c10184l.f20762l && this.f20761l == c10184l.f20761l && this.f20765l == c10184l.f20765l && this.f20749l == c10184l.f20749l && this.f20764l == c10184l.f20764l && this.f20759l == c10184l.f20759l && this.f20763l == c10184l.f20763l && this.f20747l == c10184l.f20747l && this.f20753l == c10184l.f20753l && Arrays.equals(this.f20766l, c10184l.f20766l) && AbstractC15091l.crashlytics(Long.valueOf(this.f20752l), Long.valueOf(c10184l.f20752l)) && AbstractC15091l.crashlytics(this.f20758l, c10184l.f20758l) && AbstractC15091l.crashlytics(this.f20756l, c10184l.f20756l) && (((jSONObject = this.f20760l) == null || (jSONObject2 = c10184l.f20760l) == null || AbstractC4851l.yandex(jSONObject, jSONObject2)) && this.f20768l == c10184l.f20768l && AbstractC15091l.crashlytics(this.f20757l, c10184l.f20757l) && AbstractC15091l.crashlytics(this.f20751l, c10184l.f20751l) && AbstractC15091l.crashlytics(this.f20750l, c10184l.f20750l) && AbstractC7236l.amazon(this.f20746l, c10184l.f20746l) && this.f20769l == c10184l.f20769l)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20756l, Long.valueOf(this.f20755l), Integer.valueOf(this.f20748l), Double.valueOf(this.f20762l), Integer.valueOf(this.f20761l), Integer.valueOf(this.f20765l), Long.valueOf(this.f20749l), Long.valueOf(this.f20752l), Double.valueOf(this.f20764l), Boolean.valueOf(this.f20759l), Integer.valueOf(Arrays.hashCode(this.f20766l)), Integer.valueOf(this.f20763l), Integer.valueOf(this.f20747l), String.valueOf(this.f20760l), Integer.valueOf(this.f20753l), this.f20758l, Boolean.valueOf(this.f20768l), this.f20757l, this.f20751l, this.f20750l, this.f20746l});
    }

    public final void mopub(List list) {
        ArrayList arrayList = this.f20758l;
        arrayList.clear();
        SparseArray sparseArray = this.f20754l;
        sparseArray.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C13328l c13328l = (C13328l) list.get(i);
                arrayList.add(c13328l);
                sparseArray.put(c13328l.f26161l, Integer.valueOf(i));
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f20760l;
        this.f20767l = jSONObject == null ? null : jSONObject.toString();
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 2, this.f20756l, i);
        long j = this.f20755l;
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.f20748l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.f20762l;
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.f20761l;
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f20765l;
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.f20749l;
        AbstractC9968l.subscription(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.f20752l;
        AbstractC9968l.subscription(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.f20764l;
        AbstractC9968l.subscription(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.f20759l;
        AbstractC9968l.subscription(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.smaato(parcel, 12, this.f20766l);
        int i5 = this.f20763l;
        AbstractC9968l.subscription(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.f20747l;
        AbstractC9968l.subscription(parcel, 14, 4);
        parcel.writeInt(i6);
        AbstractC9968l.vip(parcel, 15, this.f20767l);
        int i7 = this.f20753l;
        AbstractC9968l.subscription(parcel, 16, 4);
        parcel.writeInt(i7);
        AbstractC9968l.ads(parcel, 17, this.f20758l);
        boolean z2 = this.f20768l;
        AbstractC9968l.subscription(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 19, this.f20757l, i);
        AbstractC9968l.remoteconfig(parcel, 20, this.f20751l, i);
        AbstractC9968l.remoteconfig(parcel, 21, this.f20750l, i);
        AbstractC9968l.remoteconfig(parcel, 22, this.f20746l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
