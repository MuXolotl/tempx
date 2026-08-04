package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18403l implements InterfaceC14185l, InterfaceC10805l {
    public final Map amazon;
    public final boolean billing;
    public final Map crashlytics;
    public final JsonWriter loadAd;
    public final InterfaceC18528l purchase;
    public final boolean yandex = true;

    public C18403l(Writer writer, Map map, Map map2, InterfaceC18528l interfaceC18528l, boolean z) {
        this.loadAd = new JsonWriter(writer);
        this.crashlytics = map;
        this.amazon = map2;
        this.purchase = interfaceC18528l;
        this.billing = z;
    }

    public final C18403l admob(Object obj) throws IOException {
        JsonWriter jsonWriter = this.loadAd;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    admob(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        subs(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C4726l(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC18528l interfaceC18528l = (InterfaceC18528l) this.crashlytics.get(obj.getClass());
            if (interfaceC18528l != null) {
                jsonWriter.beginObject();
                interfaceC18528l.yandex(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3484l interfaceC3484l = (InterfaceC3484l) this.amazon.get(obj.getClass());
            if (interfaceC3484l != null) {
                interfaceC3484l.yandex(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.purchase.yandex(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof InterfaceC15912l) {
                int iYandex = ((InterfaceC15912l) obj).yandex();
                isPro();
                jsonWriter.value(iYandex);
                return this;
            }
            String strName = ((Enum) obj).name();
            isPro();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            isPro();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                isPro();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                admob(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                admob(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l amazon(C3537l c3537l, boolean z) throws IOException {
        String str = c3537l.yandex;
        isPro();
        JsonWriter jsonWriter = this.loadAd;
        jsonWriter.name(str);
        isPro();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l billing(C3537l c3537l, double d) throws IOException {
        String str = c3537l.yandex;
        isPro();
        JsonWriter jsonWriter = this.loadAd;
        jsonWriter.name(str);
        isPro();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.InterfaceC10805l
    public final InterfaceC10805l crashlytics(boolean z) throws IOException {
        isPro();
        this.loadAd.value(z);
        return this;
    }

    public final void isPro() {
        if (this.yandex) {
            return;
        }
        C8339l.smaato("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // defpackage.InterfaceC10805l
    public final InterfaceC10805l loadAd(String str) throws IOException {
        isPro();
        this.loadAd.value(str);
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l mopub(C3537l c3537l, long j) throws IOException {
        String str = c3537l.yandex;
        isPro();
        JsonWriter jsonWriter = this.loadAd;
        jsonWriter.name(str);
        isPro();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l purchase(C3537l c3537l, int i) throws IOException {
        String str = c3537l.yandex;
        isPro();
        JsonWriter jsonWriter = this.loadAd;
        jsonWriter.name(str);
        isPro();
        jsonWriter.value(i);
        return this;
    }

    public final C18403l subs(Object obj, String str) throws IOException {
        boolean z = this.billing;
        JsonWriter jsonWriter = this.loadAd;
        if (z) {
            if (obj == null) {
                return this;
            }
            isPro();
            jsonWriter.name(str);
            admob(obj);
            return this;
        }
        isPro();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        admob(obj);
        return this;
    }

    @Override // defpackage.InterfaceC14185l
    public final InterfaceC14185l yandex(C3537l c3537l, Object obj) throws IOException {
        subs(obj, c3537l.yandex);
        return this;
    }
}
