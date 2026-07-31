package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lٖؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1381l implements InterfaceC13081l, InterfaceC9526l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f3511l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f3512l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f3513l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f3514l;

    public C1381l(C1028l c1028l, C1028l c1028l2, C1028l c1028l3, List list) {
        if (c1028l2.pro() != c1028l.pro()) {
            AbstractC11597l.yandex("positions and textureCoordinates lengths must match.");
        }
        if (c1028l3.pro() != c1028l.pro()) {
            AbstractC11597l.yandex("positions and colors lengths must match.");
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Number) list.get(i)).intValue();
            if (iIntValue < 0 || iIntValue >= c1028l.pro()) {
                AbstractC11597l.yandex("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.f3513l = loadAd(c1028l);
        this.f3512l = loadAd(c1028l2);
        int iPro = c1028l3.pro();
        int[] iArr = new int[iPro];
        for (int i2 = 0; i2 < iPro; i2++) {
            iArr[i2] = AbstractC12953l.startapp(((C9735l) c1028l3.get(i2)).yandex);
        }
        this.f3511l = iArr;
        int size2 = list.size();
        short[] sArr = new short[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            sArr[i3] = (short) ((Number) list.get(i3)).intValue();
        }
        this.f3514l = sArr;
    }

    public static float[] loadAd(C1028l c1028l) {
        int iPro = c1028l.pro() * 2;
        float[] fArr = new float[iPro];
        for (int i = 0; i < iPro; i++) {
            long j = ((C1187l) c1028l.get(i / 2)).yandex;
            fArr[i] = i % 2 == 0 ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return fArr;
    }

    public ArrayList admob(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = (ArrayList) this.f3511l;
        if (!arrayList2.isEmpty()) {
            int i = C15500l.f30292l;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            C15500l c15500l = !arrayList3.isEmpty() ? new C15500l(outputStream, arrayList3) : null;
            if (c15500l != null) {
                arrayList.add(c15500l);
            }
        }
        Iterator it2 = ((AbstractC1186l) this.f3512l).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            C18725l.loadAd();
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle amazon() {
        C16386l c16386l = (C16386l) this.f3514l;
        if (((Bundle) this.f3511l) == null) {
            String str = (String) this.f3513l;
            SharedPreferences sharedPreferencesM4180l = c16386l.m4180l();
            C17417l c17417l = (C17417l) c16386l.f833l;
            String string = sharedPreferencesM4180l.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                C2156l.yandex();
                                                if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12668l)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                C8118l c8118l = c17417l.f33950l;
                                                C17417l.admob(c8118l);
                                                c8118l.f16908l.loadAd(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            C2156l.yandex();
                                            if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12668l)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            C8118l c8118l2 = c17417l.f33950l;
                                            C17417l.admob(c8118l2);
                                            c8118l2.f16908l.loadAd(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        C8118l c8118l3 = c17417l.f33950l;
                                        C17417l.admob(c8118l3);
                                        c8118l3.f16908l.loadAd(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    C8118l c8118l4 = c17417l.f33950l;
                                    C17417l.admob(c8118l4);
                                    c8118l4.f16908l.loadAd(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                C8118l c8118l5 = c17417l.f33950l;
                                C17417l.admob(c8118l5);
                                c8118l5.f16908l.loadAd(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            C8118l c8118l6 = c17417l.f33950l;
                            C17417l.admob(c8118l6);
                            c8118l6.f16908l.yandex("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f3511l = bundle;
                } catch (JSONException unused2) {
                    C8118l c8118l7 = c17417l.f33950l;
                    C17417l.admob(c8118l7);
                    c8118l7.f16908l.yandex("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f3511l) == null) {
                this.f3511l = (Bundle) this.f3512l;
            }
        }
        Bundle bundle2 = (Bundle) this.f3511l;
        AbstractC1051l.subs(bundle2);
        return new Bundle(bundle2);
    }

    public InterfaceC2167l billing(C7502l c7502l, C3683l... c3683lArr) {
        InterfaceC2167l interfaceC2167lAdmob = InterfaceC2167l.f4805l;
        for (C3683l c3683l : c3683lArr) {
            interfaceC2167lAdmob = AbstractC0135l.admob(c3683l);
            AbstractC13831l.metrica((C7502l) this.f3511l);
            if ((interfaceC2167lAdmob instanceof C15537l) || (interfaceC2167lAdmob instanceof C2118l)) {
                interfaceC2167lAdmob = ((C17516l) this.f3513l).purchase(c7502l, interfaceC2167lAdmob);
            }
        }
        return interfaceC2167lAdmob;
    }

    @Override // defpackage.InterfaceC9526l
    public /* synthetic */ ListenableFuture call() {
        return AbstractC7151l.admob((AbstractC2722l) this.f3512l, AbstractC6854l.loadAd(new C13610l((C5702l) this.f3513l, (C3013l) this.f3511l, (Executor) this.f3514l, 1)), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC13081l
    public int crashlytics(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f3512l;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        C10754l.tapsense(AbstractC2812l.Signature("requested global type ", i, " does not belong to the adapter:"), ((C16150l) this.f3511l).crashlytics);
        return 0;
    }

    public void mopub(Bundle bundle) {
        C16386l c16386l = (C16386l) this.f3514l;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesM4180l = c16386l.m4180l();
        C17417l c17417l = (C17417l) c16386l.f833l;
        SharedPreferences.Editor editorEdit = sharedPreferencesM4180l.edit();
        int size = bundle2.size();
        String str = (String) this.f3513l;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C2156l.yandex();
                        if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12668l)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                C8118l c8118l = c17417l.f33950l;
                                C17417l.admob(c8118l);
                                c8118l.f16908l.loadAd(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                C8118l c8118l2 = c17417l.f33950l;
                                C17417l.admob(c8118l2);
                                c8118l2.f16908l.loadAd(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        C8118l c8118l3 = c17417l.f33950l;
                        C17417l.admob(c8118l3);
                        c8118l3.f16908l.loadAd(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f3511l = bundle2;
    }

    @Override // defpackage.InterfaceC13081l
    public int purchase(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f3513l;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        C14785l c14785l = (C14785l) this.f3514l;
        C16150l c16150l = (C16150l) this.f3511l;
        int i2 = c14785l.f28908l;
        c14785l.f28908l = i2 + 1;
        ((SparseArray) c14785l.f28907l).put(i2, c16150l);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.f3512l).put(i2, i);
        return i2;
    }

    @Override // defpackage.InterfaceC13081l
    public void yandex() {
        C14785l c14785l = (C14785l) this.f3514l;
        C16150l c16150l = (C16150l) this.f3511l;
        SparseArray sparseArray = (SparseArray) c14785l.f28907l;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((C16150l) sparseArray.valueAt(size)) == c16150l) {
                sparseArray.removeAt(size);
            }
        }
    }

    public C1381l(C15509l c15509l) {
        this.f3512l = null;
        this.f3511l = null;
        this.f3514l = null;
        this.f3513l = c15509l;
    }

    public /* synthetic */ C1381l(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3513l = obj;
        this.f3512l = obj2;
        this.f3511l = obj3;
        this.f3514l = obj4;
    }

    public C1381l() {
        C17516l c17516l = new C17516l();
        this.f3513l = c17516l;
        C7502l c7502l = new C7502l(null, c17516l);
        this.f3511l = c7502l;
        this.f3512l = c7502l.isPro();
        C3316l c3316l = new C3316l(29);
        this.f3514l = c3316l;
        c7502l.smaato("require", new C3034l(c3316l));
        ((HashMap) c3316l.f7072l).put("internal.platform", CallableC14486l.crashlytics);
        c7502l.smaato("runtime.counter", new C14259l(Double.valueOf(0.0d)));
    }

    public C1381l(C16386l c16386l, String str) {
        this.f3514l = c16386l;
        AbstractC1051l.billing(str);
        this.f3513l = str;
        this.f3512l = new Bundle();
    }

    public C1381l(C7502l c7502l) {
        this.f3513l = (InterfaceC14033l) c7502l.f15511l;
        this.f3512l = (AbstractC1186l) c7502l.f15510l;
        this.f3511l = (ArrayList) c7502l.f15509l;
        this.f3514l = (Uri) c7502l.f15512l;
    }

    public C1381l(C14785l c14785l, C16150l c16150l) {
        this.f3514l = c14785l;
        this.f3513l = new SparseIntArray(1);
        this.f3512l = new SparseIntArray(1);
        this.f3511l = c16150l;
    }
}
