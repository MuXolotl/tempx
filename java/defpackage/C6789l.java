package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙ۟۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6789l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f14223l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14224l;

    public /* synthetic */ C6789l(String str, int i) {
        this.f14224l = i;
        this.f14223l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.f14224l;
        String str = this.f14223l;
        switch (i) {
            case 0:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    interfaceC14742lMo668l.mo824final(1, str);
                    interfaceC14742lMo668l.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l.close();
                }
            case 1:
                InterfaceC14742l interfaceC14742lMo668l2 = ((InterfaceC0684l) obj).mo668l("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    interfaceC14742lMo668l2.mo824final(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC14742lMo668l2.mo827l()) {
                        byte[] blob = interfaceC14742lMo668l2.getBlob(0);
                        C4279l c4279l = C4279l.loadAd;
                        arrayList.add(AbstractC7280l.loadAd(blob));
                    }
                    interfaceC14742lMo668l2.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC14742lMo668l2.close();
                    throw th;
                }
            case 2:
                InterfaceC0684l interfaceC0684l = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l3 = interfaceC0684l.mo668l("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    interfaceC14742lMo668l3.mo824final(1, str);
                    interfaceC14742lMo668l3.mo827l();
                    return Integer.valueOf(AbstractC16837l.crashlytics(interfaceC0684l));
                } finally {
                    interfaceC14742lMo668l3.close();
                }
            case 3:
                InterfaceC14742l interfaceC14742lMo668l4 = ((InterfaceC0684l) obj).mo668l("DELETE FROM workspec WHERE id=?");
                try {
                    interfaceC14742lMo668l4.mo824final(1, str);
                    interfaceC14742lMo668l4.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l4.close();
                }
            case 4:
                InterfaceC14742l interfaceC14742lMo668l5 = ((InterfaceC0684l) obj).mo668l("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC14742lMo668l5.mo824final(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC14742lMo668l5.mo827l()) {
                        String strMo826implements = interfaceC14742lMo668l5.mo826implements(0);
                        EnumC9176l enumC9176lAdmob = AbstractC11748l.admob((int) interfaceC14742lMo668l5.getLong(1));
                        C15573l c15573l = new C15573l();
                        c15573l.yandex = strMo826implements;
                        c15573l.loadAd = enumC9176lAdmob;
                        arrayList2.add(c15573l);
                    }
                    interfaceC14742lMo668l5.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    interfaceC14742lMo668l5.close();
                    throw th2;
                }
            default:
                InterfaceC14742l interfaceC14742lMo668l6 = ((InterfaceC0684l) obj).mo668l("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    interfaceC14742lMo668l6.mo824final(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC14742lMo668l6.mo827l()) {
                        arrayList3.add(interfaceC14742lMo668l6.mo826implements(0));
                    }
                    interfaceC14742lMo668l6.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    interfaceC14742lMo668l6.close();
                    throw th3;
                }
        }
    }
}
