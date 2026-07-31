package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends t {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final TextStyle e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public u(TextStyle textStyle, boolean z) {
        super(j$.time.temporal.p.e, "ZoneText(" + textStyle + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.a(textStyle, "textStyle");
        this.e = textStyle;
        this.f = z;
    }

    @Override // j$.time.format.t
    public final n a(v vVar) {
        n nVar;
        if (this.e == TextStyle.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.h.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar;
        }
        n nVar2 = vVar.b ? new n("", null, null) : new m("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                nVar2.a(str, str);
                HashMap map2 = (HashMap) e0.d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) e0.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) e0.f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) e0.e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) e0.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i2 = this.e == TextStyle.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    nVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVar2)));
        return nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.format.t, j$.time.format.e
    public final boolean j(x xVar, StringBuilder sb) {
        boolean zG;
        String[] strArr;
        ZoneId zoneId = (ZoneId) xVar.b(j$.time.temporal.p.a);
        if (zoneId == null) {
            return false;
        }
        String strI = zoneId.i();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = xVar.a;
            String str = null;
            Map concurrentHashMap = null;
            if (this.f) {
                zG = 2;
            } else if (temporalAccessor.e(ChronoField.INSTANT_SECONDS)) {
                zG = zoneId.getRules().g(Instant.O(temporalAccessor));
            } else {
                ChronoField chronoField = ChronoField.EPOCH_DAY;
                if (temporalAccessor.e(chronoField)) {
                    ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                    if (temporalAccessor.e(chronoField2)) {
                        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(temporalAccessor.C(chronoField));
                        LocalTime localTimeQ = LocalTime.Q(temporalAccessor.C(chronoField2));
                        localDateOfEpochDay.getClass();
                        LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOfEpochDay, localTimeQ);
                        Object objE = zoneId.getRules().e(localDateTimeOf);
                        if ((objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null) == null) {
                            ZoneRules rules = zoneId.getRules();
                            localDateTimeOf.getClass();
                            ZonedDateTime zonedDateTimeN = ZonedDateTime.N(localDateTimeOf, zoneId, null);
                            zG = rules.g(Instant.ofEpochSecond(zonedDateTimeN.M(), zonedDateTimeN.b().d));
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            Locale locale = xVar.b.b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.e;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap2 = i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strI);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strI);
                    String[] strArr2 = {strI, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strI, strI};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(strI, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG != 0) {
                    str = zG != 1 ? strArr[textStyle2.a + 5] : strArr[textStyle2.a + 3];
                } else {
                    str = strArr[textStyle2.a + 1];
                }
            }
            if (str != null) {
                strI = str;
            }
        }
        sb.append(strI);
        return true;
    }
}
