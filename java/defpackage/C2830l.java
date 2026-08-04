package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: lؔۖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2830l {
    public final ArrayList crashlytics;
    public final HashMap loadAd;
    public final HashMap yandex;

    public C2830l(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.yandex = new HashMap();
        this.loadAd = new HashMap();
        this.crashlytics = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC14033l interfaceC14033l = (InterfaceC14033l) it.next();
            if (TextUtils.isEmpty(interfaceC14033l.mopub())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                InterfaceC14033l interfaceC14033l2 = (InterfaceC14033l) this.yandex.put(interfaceC14033l.mopub(), interfaceC14033l);
                if (interfaceC14033l2 != null) {
                    String canonicalName = interfaceC14033l2.getClass().getCanonicalName();
                    String canonicalName2 = interfaceC14033l.getClass().getCanonicalName();
                    C8339l.metrica(AbstractC9361l.advert(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw AbstractC15560l.adcel(it2);
        }
        this.crashlytics.addAll(list);
    }

    public final C1381l loadAd(Uri uri) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        C16971l c16971lMetrica2 = AbstractC1186l.metrica();
        String encodedFragment = uri.getEncodedFragment();
        List listTapsense = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? C13708l.f26763l : AbstractC1186l.tapsense(new C16359l(new C8662l(new C15053l(new C4256l("+".charAt(0), 0)), true, (AbstractC8791l) C16219l.f31752l, Alert.DURATION_SHOW_INDEFINITELY), encodedFragment.substring(10)));
        int size = listTapsense.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listTapsense.get(i);
            Matcher matcher = AbstractC3260l.yandex.matcher(str);
            if (!matcher.matches()) {
                C8339l.metrica("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            c16971lMetrica2.crashlytics(matcher.group(1));
        }
        C13708l c13708lMopub = c16971lMetrica2.mopub();
        if (c13708lMopub.f26765l > 0) {
            String str2 = (String) c13708lMopub.get(0);
            if (this.loadAd.get(str2) != null) {
                C18725l.loadAd();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            throw new C8413l(AbstractC9361l.advert(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        AbstractC1186l abstractC1186lApplovin = c16971lMetrica.mopub().applovin();
        C7502l c7502l = new C7502l();
        String scheme = uri.getScheme();
        InterfaceC14033l interfaceC14033l = (InterfaceC14033l) this.yandex.get(scheme);
        if (interfaceC14033l == null) {
            throw new C8413l(AbstractC14814l.startapp("Requested backend isn't registered: ", scheme));
        }
        c7502l.f15511l = interfaceC14033l;
        c7502l.f15509l = this.crashlytics;
        c7502l.f15510l = abstractC1186lApplovin;
        if (!abstractC1186lApplovin.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = abstractC1186lApplovin.listIterator(abstractC1186lApplovin.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        C18725l.loadAd();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        c7502l.f15512l = uri;
        return new C1381l(c7502l);
    }

    public final Object yandex(Uri uri, InterfaceC0643l interfaceC0643l) {
        return interfaceC0643l.loadAd(loadAd(uri));
    }
}
