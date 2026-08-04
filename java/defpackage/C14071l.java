package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.subs;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* JADX INFO: renamed from: lَٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14071l implements InterfaceC10654l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14071l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC10654l
    public final subs yandex(AbstractC9694l abstractC9694l, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C9554l c9554l) {
        int i = 0;
        int i2 = 1;
        switch (this.yandex) {
            case 0:
                return new C2979l(abstractC9694l, ((Catalog2Layout.Header) catalog2Layout).yandex, catalog2Block);
            case 1:
                return new C5080l(new C15578l(811048611, true, new C0265l(abstractC9694l, (Catalog2Layout.SynthOpenCacheSearch) catalog2Layout)));
            case 2:
                return new C5080l(new C15578l(1560004398, true, new C6640l(catalog2Block, abstractC9694l, 9)));
            case 3:
                return new C5080l(new C15578l(32570960, true, new C6204l(c9554l, abstractC9694l, catalog2Block)));
            case 4:
                return new C5080l(new C15578l(1083983765, true, new C3672l(catalog2Block, c9554l, i)));
            case 5:
                return new C5080l(new C15578l(185458284, true, new C3672l(catalog2Block, c9554l, i2)));
            case 6:
                return new C5080l(AbstractC11173l.loadAd);
            case 7:
                return new C5080l(new C15578l(1770570943, true, new C9834l(c9554l, abstractC9694l, catalog2Block)));
            case 8:
                return new C5080l(new C15578l(2112357978, true, new C13471l(catalog2Block, c9554l, abstractC9694l, i)));
            case 9:
                return new C5080l(new C15578l(1574591038, true, new C3672l(catalog2Block, c9554l, 2)));
            case 10:
                return new C5080l(new C15578l(1114086520, true, new C13471l(catalog2Block, c9554l, abstractC9694l, i2)));
            case 11:
                return new C2979l(abstractC9694l, ((Catalog2Layout.LargeHeader) catalog2Layout).yandex, catalog2Block);
            case 12:
                return new C5080l(AbstractC11173l.crashlytics);
            case 13:
                return new C5080l(AbstractC11173l.amazon);
            case 14:
                Catalog2Layout.CompactHeader compactHeader = (Catalog2Layout.CompactHeader) catalog2Layout;
                List crashlytics = catalog2Block.getCrashlytics();
                return new C8092l(abstractC9694l, compactHeader, crashlytics != null ? (Catalog2Button) AbstractC16901l.m4217extends(crashlytics) : null);
            case 15:
                return new C13793l();
            case 16:
                return new C17329l(abstractC9694l, true);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C17329l(abstractC9694l, false);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C17329l(abstractC9694l, true);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C13793l();
            default:
                return new C4559l(8);
        }
    }
}
