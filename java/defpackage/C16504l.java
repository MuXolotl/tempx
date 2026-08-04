package defpackage;

/* JADX INFO: renamed from: lٖٜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16504l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f32246l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ String f32247l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16504l(String str, int i) {
        super(11);
        this.f32246l = i;
        this.f32247l = str;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؑٞۘ */
    public boolean mo203l() {
        switch (this.f32246l) {
            case 3:
                return false;
            default:
                return super.mo203l();
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lّٔ٘ */
    public final AbstractC8189l mo226l() {
        int i = this.f32246l;
        String str = this.f32247l;
        switch (i) {
            case 0:
                if (str != null) {
                    return new C12772l(str, 18);
                }
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                C16287l.yandex.getClass();
                sb.append(C16287l.crashlytics());
                sb.append("?section=podcasts");
                return new C12772l(sb.toString(), 8);
            case 1:
                return new C7093l((String) null, 1, str);
            case 2:
                return new C7093l(str, 2, (String) null);
            default:
                return new C12772l(str, 13);
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٔ٘۠ */
    public AbstractC14412l mo227l() {
        switch (this.f32246l) {
            case 3:
                return new C7511l();
            default:
                return super.mo227l();
        }
    }
}
