package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٍؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9310l {
    public static final C9310l remoteconfig;
    public static final C9310l smaato;
    public final C8081l admob;
    public final boolean amazon;
    public final boolean billing;
    public final int crashlytics;
    public final HashSet firebase;
    public final HashSet isPro;
    public final int loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final HashSet subs;
    public final int yandex;

    static {
        C10732l c10732l = new C10732l();
        c10732l.amazon = 1;
        c10732l.mopub = true;
        c10732l.subs = false;
        C9310l c9310l = new C9310l(c10732l);
        smaato = c9310l;
        C10732l c10732l2 = new C10732l();
        c10732l2.amazon = 2;
        c10732l2.mopub = true;
        c10732l2.subs = true;
        c10732l2.loadAd();
        C10732l c10732l3 = new C10732l();
        c10732l3.firebase = C8081l.loadAd;
        c10732l3.amazon = 2;
        C9310l c9310l2 = new C9310l(c10732l3);
        C10732l c10732l4 = new C10732l(c9310l2);
        C8081l c8081l = C8081l.amazon;
        c10732l4.firebase = c8081l;
        c10732l4.billing = 2;
        c10732l4.subs = true;
        c10732l4.loadAd();
        C10732l c10732l5 = new C10732l(c9310l2);
        c10732l5.firebase = c8081l;
        c10732l5.billing = 2;
        c10732l5.purchase = 1;
        c10732l5.subs = true;
        remoteconfig = new C9310l(c10732l5);
        C10732l c10732l6 = new C10732l(c9310l2);
        c10732l6.billing = 1;
        c10732l6.firebase = C8081l.purchase;
        c10732l6.subs = true;
        c10732l6.isPro = true;
        c10732l6.loadAd();
        C10732l c10732l7 = new C10732l(c9310l2);
        c10732l7.amazon = 4;
        c10732l7.billing = 4;
        c10732l7.purchase = 1;
        c10732l7.firebase = C8081l.billing;
        c10732l7.subs = true;
        c10732l7.isPro = true;
        c10732l7.loadAd();
        C10732l c10732l8 = new C10732l(c9310l2);
        c10732l8.amazon = 4;
        c10732l8.purchase = 1;
        c10732l8.subs = true;
        c10732l8.isPro = true;
        c10732l8.loadAd();
        C10732l c10732l9 = new C10732l();
        c10732l9.amazon = 2;
        c10732l9.billing = 2;
        c10732l9.purchase = 1;
        c10732l9.yandex(1);
        c10732l9.yandex(Action.TYPE_MEDIA_PLAYBACK);
        c10732l9.subs = true;
        c10732l9.loadAd();
        C10732l c10732l10 = new C10732l();
        c10732l10.amazon = 1;
        c10732l10.billing = 1;
        c10732l10.yandex(1);
        c10732l10.mopub = true;
        c10732l10.subs = true;
        c10732l10.loadAd();
        C10732l c10732l11 = new C10732l();
        c10732l11.amazon = 2;
        c10732l11.yandex(1);
        c10732l11.yandex(Action.TYPE_COMPOSE_MESSAGE);
        c10732l11.yandex(Action.TYPE_MEDIA_PLAYBACK);
        c10732l11.mopub = true;
        c10732l11.admob = true;
        c10732l11.subs = true;
        c10732l11.loadAd();
        C10732l c10732l12 = new C10732l(c9310l);
        c10732l12.yandex.add(Integer.valueOf(Action.TYPE_APP_ICON));
        c10732l12.loadAd();
    }

    public C9310l(C10732l c10732l) {
        int i = c10732l.amazon;
        this.yandex = i;
        this.loadAd = c10732l.purchase;
        this.crashlytics = c10732l.billing;
        this.admob = c10732l.firebase;
        this.amazon = c10732l.mopub;
        this.purchase = c10732l.admob;
        this.billing = c10732l.subs;
        this.mopub = c10732l.isPro;
        HashSet hashSet = new HashSet(c10732l.yandex);
        this.subs = hashSet;
        HashSet hashSet2 = new HashSet(c10732l.crashlytics);
        this.firebase = hashSet2;
        HashSet hashSet3 = c10732l.loadAd;
        HashSet hashSet4 = new HashSet(hashSet3);
        hashSet4.retainAll(hashSet);
        if (!hashSet4.isEmpty()) {
            C8339l.metrica("Disallowed action types cannot also be in the required set");
            throw null;
        }
        if (!hashSet3.isEmpty() && !hashSet2.isEmpty()) {
            C8339l.metrica("Both disallowed and allowed action type set cannot be defined.");
            throw null;
        }
        this.isPro = new HashSet(hashSet3);
        if (hashSet.size() <= i) {
            return;
        }
        C8339l.metrica("Required action types exceeded max allowed actions");
        throw null;
    }

    public final void yandex(List list) {
        HashSet hashSet = this.subs;
        Set hashSet2 = hashSet.isEmpty() ? Collections.EMPTY_SET : new HashSet(hashSet);
        Iterator it = list.iterator();
        int i = this.yandex;
        int i2 = this.loadAd;
        int i3 = this.crashlytics;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            HashSet hashSet3 = this.isPro;
            if (!hashSet3.isEmpty() && hashSet3.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()) + " is disallowed");
            }
            HashSet hashSet4 = this.firebase;
            if (!hashSet4.isEmpty() && !hashSet4.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()) + " is not allowed");
            }
            hashSet2.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i6--;
                if (i6 < 0) {
                    C8339l.metrica(AbstractC15560l.tapsense("Action list exceeded max number of ", i3, " actions with custom titles"));
                    return;
                }
                this.admob.loadAd(title);
            }
            i4--;
            if (i4 < 0) {
                C8339l.metrica(AbstractC15560l.tapsense("Action list exceeded max number of ", i, " actions"));
                return;
            }
            if ((action.getFlags() & 1) != 0 && (i5 = i5 - 1) < 0) {
                C8339l.metrica(AbstractC15560l.tapsense("Action list exceeded max number of ", i2, " primary actions"));
                return;
            }
            if (this.amazon && action.getIcon() == null && !action.isStandard()) {
                C8339l.metrica("Non-standard actions without an icon are disallowed");
                return;
            }
            boolean z = this.purchase;
            if (z && ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard())) {
                C8339l.metrica("Non-standard actions without a background color are disallowed");
                return;
            }
            if (!z && !CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.mopub && (action.getFlags() & 1) == 0) {
                C8339l.metrica("Background color can only be set for primary actions");
                return;
            } else if (!this.billing && action.getOnClickDelegate() != null && !action.isStandard()) {
                C8339l.metrica("Setting a click listener for a custom action is disallowed");
                return;
            }
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        C8339l.metrica(AbstractC5020l.tapsense("Missing required action types: ", sb));
    }
}
