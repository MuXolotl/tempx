package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC0933l;
import defpackage.AbstractC15091l;
import defpackage.AbstractC16840l;
import defpackage.AbstractC4851l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C1056l;
import defpackage.C12525l;
import defpackage.C13038l;
import defpackage.C13546l;
import defpackage.C13727l;
import defpackage.C15455l;
import defpackage.C16640l;
import defpackage.C6872l;
import defpackage.C8339l;
import ealvatag.tag.datatype.DataTypes;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MediaInfo extends AbstractC9453l implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long f545l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f546l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C13727l f547l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f548l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final String f549l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f550l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f551l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final String f552l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public List f553l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final String f554l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f555l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1056l f556l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C16640l f557l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f558l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final List f559l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f560l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final String f561l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final JSONObject f562l;

    static {
        Pattern pattern = AbstractC15091l.yandex;
        CREATOR = new C13546l(13);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        C16640l c16640l;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13038l c13038lMetrica;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        if ("NONE".equals(strOptString)) {
            this.f550l = 0;
        } else if ("BUFFERED".equals(strOptString)) {
            this.f550l = 1;
        } else if ("LIVE".equals(strOptString)) {
            this.f550l = 2;
        } else {
            this.f550l = -1;
        }
        this.f546l = AbstractC15091l.yandex(jSONObject, DataTypes.OBJ_CONTENT_TYPE);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            C1056l c1056l = new C1056l(jSONObject2.getInt("metadataType"));
            this.f556l = c1056l;
            c1056l.mopub(jSONObject2);
        }
        this.f555l = -1L;
        if (this.f550l != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                this.f555l = (long) (dOptDouble * 1000.0d);
            }
        }
        int i10 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i11 = 0;
            while (i11 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                long j = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                int i12 = "TEXT".equals(strOptString2) ? i8 : "AUDIO".equals(strOptString2) ? i7 : "VIDEO".equals(strOptString2) ? 3 : i9;
                String strYandex = AbstractC15091l.yandex(jSONObject3, "trackContentId");
                String strYandex2 = AbstractC15091l.yandex(jSONObject3, "trackContentType");
                String strYandex3 = AbstractC15091l.yandex(jSONObject3, "name");
                String strYandex4 = AbstractC15091l.yandex(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i6 = "SUBTITLES".equals(string) ? i8 : "CAPTIONS".equals(string) ? i7 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? i10 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i6 = i9;
                }
                if (jSONObject3.has("roles")) {
                    C12525l c12525l = AbstractC0933l.f2615l;
                    Object[] objArrCopyOf = new Object[i10];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i13 = i9;
                    int i14 = i13;
                    while (i13 < jSONArray2.length()) {
                        String strOptString3 = jSONArray2.optString(i13);
                        strOptString3.getClass();
                        int length = objArrCopyOf.length;
                        int i15 = i14 + 1;
                        int iMopub = AbstractC16840l.mopub(length, i15);
                        if (iMopub > length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iMopub);
                        }
                        objArrCopyOf[i14] = strOptString3;
                        i13++;
                        i14 = i15;
                    }
                    c13038lMetrica = AbstractC0933l.metrica(i14, objArrCopyOf);
                } else {
                    c13038lMetrica = null;
                }
                arrayList.add(new MediaTrack(j, i12, strYandex, strYandex2, strYandex3, strYandex4, i6, c13038lMetrica, jSONObject3.optJSONObject("customData")));
                i11++;
                i10 = 4;
                i7 = 2;
                i8 = 1;
                i9 = 0;
            }
            this.f559l = new ArrayList(arrayList);
        } else {
            this.f559l = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            C13727l c13727l = new C13727l(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            c13727l.f26791l = (float) jSONObject4.optDouble("fontScale", 1.0d);
            c13727l.f26790l = C13727l.billing(jSONObject4.optString("foregroundColor"));
            c13727l.f26787l = C13727l.billing(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    c13727l.f26794l = 0;
                } else {
                    if ("OUTLINE".equals(string2)) {
                        i5 = 1;
                    } else if ("DROP_SHADOW".equals(string2)) {
                        i5 = 2;
                    } else if ("RAISED".equals(string2)) {
                        i5 = 3;
                    } else if ("DEPRESSED".equals(string2)) {
                        c13727l.f26794l = 4;
                    }
                    c13727l.f26794l = i5;
                }
            }
            c13727l.f26793l = C13727l.billing(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    c13727l.f26797l = 0;
                } else if ("NORMAL".equals(string3)) {
                    c13727l.f26797l = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i = 2;
                    c13727l.f26797l = 2;
                }
                i = 2;
            } else {
                i = 2;
            }
            c13727l.f26788l = C13727l.billing(jSONObject4.optString("windowColor"));
            if (c13727l.f26797l == i) {
                c13727l.f26789l = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            c13727l.f26796l = AbstractC15091l.yandex(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    c13727l.f26792l = 0;
                } else {
                    if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                        i4 = 1;
                    } else if ("SERIF".equals(string4)) {
                        i4 = 2;
                    } else if ("MONOSPACED_SERIF".equals(string4)) {
                        i4 = 3;
                    } else {
                        if ("CASUAL".equals(string4)) {
                            i3 = 4;
                        } else if ("CURSIVE".equals(string4)) {
                            i3 = 5;
                        } else if ("SMALL_CAPITALS".equals(string4)) {
                            c13727l.f26792l = 6;
                        }
                        c13727l.f26792l = i3;
                    }
                    c13727l.f26792l = i4;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    c13727l.f26798l = 0;
                } else {
                    if ("BOLD".equals(string5)) {
                        i2 = 1;
                    } else if ("ITALIC".equals(string5)) {
                        i2 = 2;
                    } else if ("BOLD_ITALIC".equals(string5)) {
                        i2 = 3;
                    }
                    c13727l.f26798l = i2;
                }
            }
            c13727l.f26786l = jSONObject4.optJSONObject("customData");
            this.f547l = c13727l;
            c16640l = null;
        } else {
            c16640l = null;
            this.f547l = null;
        }
        billing(jSONObject);
        this.f562l = jSONObject.optJSONObject("customData");
        this.f560l = AbstractC15091l.yandex(jSONObject, "entity");
        this.f561l = AbstractC15091l.yandex(jSONObject, "atvEntity");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.f557l = jSONObjectOptJSONObject == null ? c16640l : new C16640l(AbstractC15091l.yandex(jSONObjectOptJSONObject, "adTagUrl"), AbstractC15091l.yandex(jSONObjectOptJSONObject, "adsResponse"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0) {
                this.f545l = (long) (dOptDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.f554l = jSONObject.optString("contentUrl");
        }
        this.f549l = AbstractC15091l.yandex(jSONObject, "hlsSegmentFormat");
        this.f552l = AbstractC15091l.yandex(jSONObject, "hlsVideoSegmentFormat");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[LOOP:0: B:5:0x0024->B:33:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c2 A[SYNTHETIC] */
    public final void billing(JSONObject jSONObject) {
        long j;
        C6872l c6872l;
        C15455l c15455l;
        long j2 = 1000;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    j = j2;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j3 = jSONObject2.getLong("position");
                        Pattern pattern = AbstractC15091l.yandex;
                        long j4 = j3 * j2;
                        boolean zOptBoolean = jSONObject2.optBoolean("isWatched");
                        long jOptLong = jSONObject2.optLong("duration") * j2;
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (jSONArrayOptJSONArray != null) {
                            strArr = new String[jSONArrayOptJSONArray.length()];
                            j = j2;
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                try {
                                    strArr[i2] = jSONArrayOptJSONArray.getString(i2);
                                } catch (JSONException e) {
                                    e = e;
                                    String message = e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    Log.d("AdBreakInfo", "Error while creating an AdBreakInfo from JSON: " + message);
                                    c15455l = null;
                                }
                            }
                        } else {
                            j = j2;
                        }
                        c15455l = new C15455l(j4, string, jOptLong, zOptBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e2) {
                        e = e2;
                        j = j2;
                    }
                    if (c15455l != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(c15455l);
                        i++;
                        j2 = j;
                    }
                } else {
                    j = j2;
                }
                c15455l = null;
                if (c15455l != null) {
                    arrayList.clear();
                    break;
                } else {
                    arrayList.add(c15455l);
                    i++;
                    j2 = j;
                }
            }
            this.f558l = new ArrayList(arrayList);
        } else {
            j = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long jOptLong2 = jSONObject3.optLong("duration") * j;
                        String strYandex = AbstractC15091l.yandex(jSONObject3, "clickThroughUrl");
                        String strYandex2 = AbstractC15091l.yandex(jSONObject3, "contentUrl");
                        String strYandex3 = AbstractC15091l.yandex(jSONObject3, "mimeType");
                        if (strYandex3 == null) {
                            strYandex3 = AbstractC15091l.yandex(jSONObject3, DataTypes.OBJ_CONTENT_TYPE);
                        }
                        String str = strYandex3;
                        String strYandex4 = AbstractC15091l.yandex(jSONObject3, "title");
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("customData");
                        String strYandex5 = AbstractC15091l.yandex(jSONObject3, "contentId");
                        String strYandex6 = AbstractC15091l.yandex(jSONObject3, "posterUrl");
                        long jIntValue = jSONObject3.has("whenSkippable") ? ((long) ((Integer) jSONObject3.get("whenSkippable")).intValue()) * j : -1L;
                        String strYandex7 = AbstractC15091l.yandex(jSONObject3, "hlsSegmentFormat");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        c6872l = new C6872l(string2, strYandex4, jOptLong2, strYandex2, str, strYandex, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), strYandex5, strYandex6, jIntValue, strYandex7, jSONObjectOptJSONObject2 == null ? null : new C16640l(AbstractC15091l.yandex(jSONObjectOptJSONObject2, "adTagUrl"), AbstractC15091l.yandex(jSONObjectOptJSONObject2, "adsResponse")));
                    } catch (JSONException e3) {
                        String message2 = e3.getMessage();
                        Locale locale2 = Locale.ROOT;
                        Log.d("AdBreakClipInfo", "Error while creating an AdBreakClipInfo from JSON: " + message2);
                        c6872l = null;
                    }
                } else {
                    c6872l = null;
                }
                if (c6872l == null) {
                    arrayList2.clear();
                    break;
                }
                arrayList2.add(c6872l);
            }
            this.f553l = new ArrayList(arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f562l;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.f562l;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC4851l.yandex(jSONObject, jSONObject2)) && AbstractC15091l.crashlytics(this.f551l, mediaInfo.f551l) && this.f550l == mediaInfo.f550l && AbstractC15091l.crashlytics(this.f546l, mediaInfo.f546l) && AbstractC15091l.crashlytics(this.f556l, mediaInfo.f556l) && this.f555l == mediaInfo.f555l && AbstractC15091l.crashlytics(this.f559l, mediaInfo.f559l) && AbstractC15091l.crashlytics(this.f547l, mediaInfo.f547l) && AbstractC15091l.crashlytics(this.f558l, mediaInfo.f558l) && AbstractC15091l.crashlytics(this.f553l, mediaInfo.f553l) && AbstractC15091l.crashlytics(this.f560l, mediaInfo.f560l) && AbstractC15091l.crashlytics(this.f557l, mediaInfo.f557l) && this.f545l == mediaInfo.f545l && AbstractC15091l.crashlytics(this.f561l, mediaInfo.f561l) && AbstractC15091l.crashlytics(this.f554l, mediaInfo.f554l) && AbstractC15091l.crashlytics(this.f549l, mediaInfo.f549l) && AbstractC15091l.crashlytics(this.f552l, mediaInfo.f552l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f551l, Integer.valueOf(this.f550l), this.f546l, this.f556l, Long.valueOf(this.f555l), String.valueOf(this.f562l), this.f559l, this.f547l, this.f558l, this.f553l, this.f560l, this.f557l, Long.valueOf(this.f545l), this.f561l, this.f549l, this.f552l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f562l;
        this.f548l = jSONObject == null ? null : jSONObject.toString();
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        String str = this.f551l;
        if (str == null) {
            str = "";
        }
        AbstractC9968l.vip(parcel, 2, str);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f550l);
        AbstractC9968l.vip(parcel, 4, this.f546l);
        AbstractC9968l.remoteconfig(parcel, 5, this.f556l, i);
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeLong(this.f555l);
        AbstractC9968l.ads(parcel, 7, this.f559l);
        AbstractC9968l.remoteconfig(parcel, 8, this.f547l, i);
        AbstractC9968l.vip(parcel, 9, this.f548l);
        List list = this.f558l;
        AbstractC9968l.ads(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.f553l;
        AbstractC9968l.ads(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        AbstractC9968l.vip(parcel, 12, this.f560l);
        AbstractC9968l.remoteconfig(parcel, 13, this.f557l, i);
        AbstractC9968l.subscription(parcel, 14, 8);
        parcel.writeLong(this.f545l);
        AbstractC9968l.vip(parcel, 15, this.f561l);
        AbstractC9968l.vip(parcel, 16, this.f554l);
        AbstractC9968l.vip(parcel, 17, this.f549l);
        AbstractC9968l.vip(parcel, 18, this.f552l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public MediaInfo(String str, int i, String str2, C1056l c1056l, long j, ArrayList arrayList, C13727l c13727l, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, C16640l c16640l, long j2, String str5, String str6, String str7, String str8) {
        this.f551l = str;
        this.f550l = i;
        this.f546l = str2;
        this.f556l = c1056l;
        this.f555l = j;
        this.f559l = arrayList;
        this.f547l = c13727l;
        this.f548l = str3;
        if (str3 != null) {
            try {
                this.f562l = new JSONObject(this.f548l);
            } catch (JSONException unused) {
                this.f562l = null;
                this.f548l = null;
            }
        } else {
            this.f562l = null;
        }
        this.f558l = arrayList2;
        this.f553l = arrayList3;
        this.f560l = str4;
        this.f557l = c16640l;
        this.f545l = j2;
        this.f561l = str5;
        this.f554l = str6;
        this.f549l = str7;
        this.f552l = str8;
        if (this.f551l == null && str6 == null && str4 == null) {
            C8339l.metrica("Either contentID or contentUrl or entity should be set");
            throw null;
        }
    }
}
