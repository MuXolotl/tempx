package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8612l extends AbstractC11726l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f17762l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile List f17763l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f17764l;

    public C8612l(Object obj) {
        super(obj);
        this.f17762l = "PluginConfigT";
        this.f17764l = 1;
    }

    @Override // defpackage.AbstractC11726l
    public final int amazon() {
        return this.f17764l;
    }

    @Override // defpackage.AbstractC11726l
    public final String crashlytics() {
        return this.f17762l;
    }

    @Override // defpackage.AbstractC11726l
    public final List getUpperBounds() {
        List list = this.f17763l;
        if (list != null) {
            return list;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        List listSingletonList = Collections.singletonList(c2336l.remoteconfig(c2336l.loadAd(Object.class), Collections.EMPTY_LIST, true));
        this.f17763l = listSingletonList;
        return listSingletonList;
    }
}
